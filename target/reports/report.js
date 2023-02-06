$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/login.feature");
formatter.feature({
  "name": "Validate the login functionality of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the chrome and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_launch_the_chrome_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the login functionality with Invaild username and Invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User should input the inavild uername and password in textbox",
  "rows": [
    {
      "cells": [
        "Rohit",
        "Rohit@12",
        "Ajay",
        "Ajay@12",
        "Sarath",
        "Sarath@12"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userShouldInputTheInavildUernameAndPasswordInTextbox(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should check the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userShouldCheckTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To print the title",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_print_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to invaild credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_navigate_to_invaild_credential_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Verify the incoorect cred page\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.stepdefinition.StepDefinition.user_should_navigate_to_invaild_credential_page(StepDefinition.java:42)\r\n\tat ✽.User should navigate to invaild credential page(file:src/test/resources/FeatureFiles/login.feature:15)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});