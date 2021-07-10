Feature: register New User
  As a web user i want to register in Web table app
  and verify my information in the table bellow

  @smokeTest
  Scenario: Register Successful
    Given Open the browser in WebTables Demoqa app
    When  Fill all the requested info
    Then  Verify the date injected in the table bellow