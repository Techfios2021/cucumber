$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/BlueBackgroud.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios settingup",
  "description": "",
  "id": "techfios-settingup",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Senario"
    }
  ]
});
formatter.before({
  "duration": 2940383700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to set the background color",
  "description": "",
  "id": "techfios-settingup;user-should-be-able-to-set-the-background-color",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Senario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the \"bluebutton\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 2155798300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bluebutton",
      "offset": 16
    }
  ],
  "location": "StepDefination.i_click_on_the(String)"
});
formatter.result({
  "duration": 2059414600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 41074900,
  "status": "passed"
});
formatter.after({
  "duration": 641088400,
  "status": "passed"
});
formatter.before({
  "duration": 2134943200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should be able to change background color",
  "description": "",
  "id": "techfios-settingup;user-should-be-able-to-change-background-color",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Senario2"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on the \"whitebutton\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 2060031200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "whitebutton",
      "offset": 16
    }
  ],
  "location": "StepDefination.i_click_on_the(String)"
});
formatter.result({
  "duration": 54291300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 38003400,
  "status": "passed"
});
formatter.after({
  "duration": 4703165900,
  "status": "passed"
});
});