param(
    [string]$Note = ""
)

# ==========================================================
# CSC241 - GitHub Course Repository Update
# Dr. Muhammad Shahid Bhatti
# ==========================================================

$RepoPath = "C:\Teaching\Fall2026\CSC241-OOP"
$MaxAttempts = 5
$RetryDelay = 5

Set-Location $RepoPath

Write-Host ""
Write-Host "=============================================" -ForegroundColor Cyan
Write-Host " CSC241 - GitHub Course Repository Update" -ForegroundColor Cyan
Write-Host "=============================================" -ForegroundColor Cyan
Write-Host ""

# ----------------------------------------------------------
# Verify Git repository
# ----------------------------------------------------------
if (-not (Test-Path ".git")) {
    Write-Host "ERROR: This folder is not a Git repository." -ForegroundColor Red
    Write-Host $RepoPath
    exit 1
}

$Branch = git branch --show-current

if ([string]::IsNullOrWhiteSpace($Branch)) {
    $Branch = "main"
}

Write-Host "Repository : $RepoPath"
Write-Host "Branch     : $Branch"
Write-Host ""

# ----------------------------------------------------------
# Stage all changes
# ----------------------------------------------------------
Write-Host "Checking local changes..." -ForegroundColor Yellow

git add -A

$ChangedFiles = git diff --cached --name-only

# ----------------------------------------------------------
# Commit if changes exist
# ----------------------------------------------------------
if ($ChangedFiles) {

    Write-Host ""
    Write-Host "Files being committed:" -ForegroundColor Green

    $ChangedFiles | ForEach-Object {
        Write-Host "  $_"
    }

    $DateTime = Get-Date -Format "yyyy-MM-dd HH:mm"

    if ([string]::IsNullOrWhiteSpace($Note)) {
        $CommitMessage = "CSC241 course update - $DateTime"
    }
    else {
        $CommitMessage = "CSC241 update - $DateTime - $Note"
    }

    Write-Host ""
    Write-Host "Commit message:" -ForegroundColor Cyan
    Write-Host "  $CommitMessage"
    Write-Host ""

    git commit -m "$CommitMessage"

    if ($LASTEXITCODE -ne 0) {
        Write-Host "Commit failed. Nothing was pushed." -ForegroundColor Red
        exit 1
    }
}
else {
    Write-Host "No new local files need committing." -ForegroundColor Yellow
}

# ----------------------------------------------------------
# Pull/rebase with retry
# ----------------------------------------------------------
Write-Host ""
Write-Host "Synchronizing with GitHub..." -ForegroundColor Yellow

$PullSucceeded = $false

for ($i = 1; $i -le $MaxAttempts; $i++) {

    Write-Host "Pull attempt $i of $MaxAttempts..."

    git -c http.version=HTTP/1.1 pull --rebase origin $Branch

    if ($LASTEXITCODE -eq 0) {
        $PullSucceeded = $true
        break
    }

    # Stop retrying if there is an actual merge/rebase conflict
    $Conflicts = git diff --name-only --diff-filter=U

    if ($Conflicts) {
        Write-Host ""
        Write-Host "A Git conflict was detected:" -ForegroundColor Red
        $Conflicts | ForEach-Object {
            Write-Host "  $_"
        }

        Write-Host ""
        Write-Host "Resolve the conflict before running this script again."
        exit 1
    }

    if ($i -lt $MaxAttempts) {
        Write-Host "GitHub connection failed. Retrying in $RetryDelay seconds..." -ForegroundColor Yellow
        Start-Sleep -Seconds $RetryDelay
    }
}

if (-not $PullSucceeded) {
    Write-Host ""
    Write-Host "Unable to contact GitHub after $MaxAttempts attempts." -ForegroundColor Red
    Write-Host "Your local commit is safe."
    Write-Host "Run this script again when the connection improves."
    exit 1
}

# ----------------------------------------------------------
# Push with retry
# ----------------------------------------------------------
Write-Host ""
Write-Host "Pushing to GitHub..." -ForegroundColor Yellow

$PushSucceeded = $false

for ($i = 1; $i -le $MaxAttempts; $i++) {

    Write-Host "Push attempt $i of $MaxAttempts..."

    git -c http.version=HTTP/1.1 push origin $Branch

    if ($LASTEXITCODE -eq 0) {
        $PushSucceeded = $true
        break
    }

    if ($i -lt $MaxAttempts) {
        Write-Host "GitHub connection failed. Retrying in $RetryDelay seconds..." -ForegroundColor Yellow
        Start-Sleep -Seconds $RetryDelay
    }
}

if (-not $PushSucceeded) {
    Write-Host ""
    Write-Host "Unable to push after $MaxAttempts attempts." -ForegroundColor Red
    Write-Host "Your commit remains safely stored on this computer."
    exit 1
}

# ----------------------------------------------------------
# Final confirmation
# ----------------------------------------------------------
Write-Host ""
Write-Host "=============================================" -ForegroundColor Green
Write-Host " GitHub repository updated successfully." -ForegroundColor Green
Write-Host "=============================================" -ForegroundColor Green
Write-Host ""

git status -sb

Write-Host ""
Write-Host "Finished."