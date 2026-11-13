@echo off
setlocal
if not exist out mkdir out
javac -d out src\shop\*.java src\app\Demo.java
if errorlevel 1 exit /b 1
java -cp out app.Demo
endlocal
