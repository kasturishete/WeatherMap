BDD Framework using Cucumber Selenium

Problem statement - Check basic functioning of  https://openweathermap.org 

Cucumber-Selenium is a behavior driven development (BDD) approach to write automation test script to test Web applications. 
It enables you to write and execute automated acceptance/unit tests. It is cross-platform, open source and free and 
automate your test cases with minimal coding.

Software Version Used
1. Java 1.8.0_45
2. selenium-java-3.141.59
3. io.cucumber

Download Framework
https://github.com/kasturishete/WeatherMap

Folder Structure
src/commonUtils/commonUtils.java - This class is designed for common methods.
src/cucumberFeature/WeatherMap.feature - This file describes test in simple easy language
src/cucumberRunner/WeatherMap.Runner - THis class is setup to run test.
src/weatherMap_Modules/WeatherMap_Action.java - This class is designed to for common action methods
src/weatherMap_StepDefinition/WeatherMap_StepDefinition.java - This class is designed to write step definitions
src/weatherMap_Page/weatheMap_Page - This class is designed for web elements


Cucumber Reports will be generated in Target Folder/cucumbet-html-report

How to Run test:

Go to CucumberRunner - Run as Junit
Cucumber test will run and results will be generated Target folder.

