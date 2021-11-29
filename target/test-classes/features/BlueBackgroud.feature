@Senario
Feature: Techfios settingup 

@Senario1
Scenario: User should be able to set the background color
     Given Set SkyBlue Background button exists
     When I click on the "bluebutton"
     Then the background color will change to sky blue
     
 @Senario2
 Scenario: User should be able to change background color
     Given Set SkyWhite Background button exists 
     When I click on the "whitebutton"
     Then the background color will change to white 