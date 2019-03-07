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

I have created Page object model to keep my code cleaner and easy to understand. The main benefit is the Object repository is independent of test cases because of which we can use same object repository for different purpose. We can give method a more realistic names which can be easily mapped with operation hapenning in UI.

Folder Structure:

src/commonUtils/commonUtils.java - This class is designed for common methods.

src/cucumberFeature/WeatherMap.feature - This file describes test in simple easy language

src/cucumberRunner/WeatherMap.Runner - This class is setup to run test.

src/weatherMap_Modules/WeatherMap_Action.java - This class is designed to for common action methods

src/weatherMap_StepDefinition/WeatherMap_StepDefinition.java - This class is designed to write step definitions

src/weatherMap_Page/weatheMap_Page - This class is designed for web elements


Cucumber Reports will be generated in Target Folder/cucumber-html-report

How to Run test:

Go to CucumberRunner - Run as Junit
Cucumber test will run and results will be generated Target folder.

Due to limited time, I have created simple Java project. 

Best way is to create Maven project, it manages dependencies, stores all project jars. It downloads the dependency jar from central repository.

1. Add all required dependencies in POM, you can get dependencies from https://mvnrepository.com/. 
2. Download settings.xml from https://maven.apache.org/settings.html. You can place this file at any of below location:
  a.	Maven install: ${maven.home}/conf/settings.xml
  b.	User’s install: ${user.home}/.m2/settings.xml

3. Go to Eclipse Preferences - Maven- User settings - Set Settings.xml path for both Global and User settings.
4. Apply and Close. Right click on Project and Maven-Update.
5. Run project as Maven build. All dependencies will be downloaded at a path specified in settings.xml (.m2 folder)
6. Run as Maven build and clean -Dtest=Runner test
7. Reports will be generated at Target folder. 

