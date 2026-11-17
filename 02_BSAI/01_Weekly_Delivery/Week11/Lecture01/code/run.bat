@echo off
if not exist out mkdir out
javac -d out *.java
if errorlevel 1 exit /b 1
java -cp out DemoMyCompare
pause
