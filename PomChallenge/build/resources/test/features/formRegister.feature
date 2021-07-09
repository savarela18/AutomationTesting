Feature: Register form
    we're practicing Pom and we use a page call demoQa
    applying the knowledge we have in cucumber with POM pattern design

  @regression
  Scenario: Register Successful
    Given that a web user wants to practice with forms in demoQa
    When he fills all the requested fields in form section
    Then he should see him data in the Thanks for submitting form
