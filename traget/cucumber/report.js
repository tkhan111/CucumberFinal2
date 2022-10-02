$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/FeatureFile.feature");
formatter.feature({
  "line": 2,
  "name": "setting the best newest background color",
  "description": "",
  "id": "setting-the-best-newest-background-color",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "duration": 2147168000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "user should be able to change background color to white",
  "description": "",
  "id": "setting-the-best-newest-background-color;user-should-be-able-to-change-background-color-to-white",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "validate White Background button is displayed;",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the whitebackground button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionfinal.validate_White_Background_button_is_displayed()"
});
formatter.result({
  "duration": 131634100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionfinal.i_click_on_the_whitebackground_button()"
});
formatter.result({
  "duration": 57978500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionfinal.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 37339500,
  "status": "passed"
});
formatter.after({
  "duration": 16300,
  "status": "passed"
});
});