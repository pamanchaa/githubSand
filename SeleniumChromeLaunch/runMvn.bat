@echo off
echo Current Directory:
cd
dir

call mvn -f SeleniumChromeLaunch\pom.xml clean install

:: C:\createFile.bat