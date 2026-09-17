Feature: Login

  Scenario: Verify Test Exception Pages
    Given User launches the chrome browser
    When User opens URL "https://practicetestautomation.com/"
    And User clicks on Practice link
    And user clicks on Test Exception link
    Then Page title should be "Test Exceptions | Practice Test Automation"
    And User closes the browser
