@echo off
setlocal
pushd "%~dp0"
if not exist out mkdir out
javac -encoding UTF-8 -d out src\model\*.java src\app\*.java
if errorlevel 1 goto failed
java -cp out app.Main
if errorlevel 1 goto failed
popd
pause
exit /b 0
:failed
echo Compile or run failed. Read the message above and check your JDK PATH.
popd
pause
exit /b 1
