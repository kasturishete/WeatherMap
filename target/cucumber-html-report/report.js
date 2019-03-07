$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/cucumberFeature/WeatherMap.feature");
formatter.feature({
  "name": "OpenWeatherMap",
  "description": "\tDescription: To test functionality basic of https://openweathermap.org/",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify presence of important labels",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigates to \"https://openweathermap.org/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_navigates_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Weather\" weather label should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.weather_label_should_be_present(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Maps\" map label should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.map_label_should_be_present(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Price\" price label should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.price_label_should_be_present(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Station\" station label should be present",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.station_label_should_be_present(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the URL",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_close_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To verify when incorrect city is entered",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to \"https://openweathermap.org/\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters invalid city \"\u003cCity\u003e\" in search box",
  "keyword": "When "
});
formatter.step({
  "name": "click on Search button",
  "keyword": "And "
});
formatter.step({
  "name": "Not found message should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User close the URL",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "City"
      ]
    },
    {
      "cells": [
        "InvalidCity"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify when incorrect city is entered",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to \"https://openweathermap.org/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_navigates_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters invalid city \"InvalidCity\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_enters_invalid_city_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.click_on_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Not found message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.not_found_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the URL",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_close_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To verify when correct city is entered",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to \"https://openweathermap.org/\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters valid city name \"\u003cCity\u003e\" in search box",
  "keyword": "When "
});
formatter.step({
  "name": "click on Search button",
  "keyword": "And "
});
formatter.step({
  "name": "Weather details should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User close the URL",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "City"
      ]
    },
    {
      "cells": [
        "Mumbai,IN"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify when correct city is entered",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to \"https://openweathermap.org/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_navigates_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid city name \"Mumbai,IN\" in search box",
  "keyword": "When "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_enters_valid_city_name_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.click_on_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Weather details should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.weather_details_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the URL",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_close_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify user is not able to Sign In with invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigates to \"https://openweathermap.org/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_navigates_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Sign In",
  "keyword": "And "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_clicks_on_Sign_In()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters invalid username as \"Kasturi@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_enters_invalid_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters invalid password as \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_enters_invalid_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_should_not_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close the URL",
  "keyword": "Then "
});
formatter.match({
  "location": "WeatherMap_StepDefinition.user_close_the_URL()"
});
formatter.result({
  "status": "passed"
});
});