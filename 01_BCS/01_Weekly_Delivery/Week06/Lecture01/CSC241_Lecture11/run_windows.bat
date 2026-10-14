@echo off
cd /d "%~dp0"
javac *.java
if errorlevel 1 (
  echo Compilation failed.
  pause
  exit /b 1
)
java CinemaCityDemo
pause
