Feature: Register form

  this is the last challenge in the automation course
  i have to open the browser, fill all fields in the page and make at least 3 validations
  also the data injection must have 3 different ways to do it Excel,
  with config.properties and faker with model data injection
  also we need to take ScreenShoot at the end of validation scenarios

  @Excel
  Scenario: Register Successful With Excel
    Given open the browser
    When  inject the data with excel in the fields
    Then  Validate the data with excel in the successful register form

  @Config
  Scenario: Register Successful With Config.properties
    Given open the browser
    When  inject the data with Config.Properties in the fields
    Then  Validate the data with Config.Properties in the successful register form

  @Faker
  Scenario: Register Successful with Faker
    Given open the browser
    When  inject the data with Faker in the fields
    Then  Validate the data with Faker in the successful register form
