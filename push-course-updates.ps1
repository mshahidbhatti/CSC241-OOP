# ==========================================================
# CSC241 GitHub Update Script
# Dr. Muhammad Shahid Bhatti
# ==========================================================

$RepoPath = "C:\Teaching\Fall2026\CSC241-OOP"

Set-Location $RepoPath

Write-Host ""
Write-Host "=============================================" -ForegroundColor Cyan
Write-Host " CSC241 - GitHub Course Repository Update" -ForegroundColor Cyan
Write-Host "=============================================" -ForegroundColor Cyan
Write-Host ""

# ----------------------------------------------------------
# Verify this is a Git repository
# ----------------------------------------------------------
if (-not (Test-Path ".git")) {
    Write-Host "ERROR: .git folder was not found." -ForegroundColor Red
    Write-Host "Expected repository: $RepoPath"
    exit 1
}

# ----------------------------------------------------------
# Detect current branch
# ----------------------------------------------------------
$Branch = git branch --show-current

if ([string]::IsNullOrWhiteSpace($Branch)) {
    $Branch = "main"
}

Write-Host "Repository : $RepoPath"
Write-Host "Branch     : $Branch"
Write-Host ""

# ----------------------------------------------------------
# Stage all new, changed and deleted files
# .gitignore rules will still be respected
# ----------------------------------------------------------
Write-Host "Checking local changes..." -ForegroundColor Yellow

git add -A

$ChangedFiles = git diff --cached --name-only

if ($ChangedFiles) {

    Write-Host ""
    Write-Host "Files to be committed:" -ForegroundColor Green
    $ChangedFiles | ForEach-Object {
        Write-Host "  $_"
    }

    # ------------------------------------------------------
    # Dynamic commit message based on current date/time
    # ------------------------------------------------------
    $DateStamp = Get-Date -Format "yyyy-MM-dd"
    $TimeStamp = Get-Date -Format "HH:mm"

    # Optional text passed when running the script
    if ($args.Count -gt 0) {
        $CustomNote = $args -join " "
        $CommitMessage = "CSC241 update - $DateStamp $TimeStamp - $CustomNote"
    }
    else {
        $CommitMessage = "CSC241 course materials update - $DateStamp $TimeStamp"
    }

    Write-Host ""
    Write-Host "Commit message:" -ForegroundColor Cyan
    Write-Host "  $CommitMessage"

    git commit -m "$CommitMessage"

    if ($LASTEXITCODE -ne 0) {
        Write-Host ""
        Write-Host "Commit failed. Repository was not pushed." -ForegroundColor Red
        exit 1
    }
}
else {
    Write-Host "No new local files need committing." -ForegroundColor Yellow
}

# ----------------------------------------------------------
# Synchronize with GitHub before pushing
# ----------------------------------------------------------
Write-Host ""
Write-Host "Synchronizing with GitHub..." -ForegroundColor Yellow

git pull --rebase origin $Branch

if ($LASTEXITCODE -ne 0) {
    Write-Host ""
    Write-Host "Git pull/rebase failed." -ForegroundColor Red
    Write-Host "There may be a merge conflict that needs manual attention."
    exit 1
}

# ----------------------------------------------------------
# Push
# ----------------------------------------------------------
Write-Host ""
Write-Host "Pushing to GitHub..." -ForegroundColor Yellow

git push origin $Branch

if ($LASTEXITCODE -eq 0) {
    Write-Host ""
    Write-Host "=============================================" -ForegroundColor Green
    Write-Host " GitHub repository updated successfully." -ForegroundColor Green
    Write-Host "=============================================" -ForegroundColor Green
}
else {
    Write-Host ""
    Write-Host "Push failed." -ForegroundColor Red
    exit 1
}