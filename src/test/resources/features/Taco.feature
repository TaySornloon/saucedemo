Feature:As a user,I should be able to select Hydro Air Fan Control in air fan under product module

  @taco
  Scenario: Verify Hydro Air Fan Control in air fan under product module
    Given user go to the Taco homepage
    And  user use a mouse to hover over on product module
    When user click on electronic control at drop down
    And  user click on Air fan option
    Then verify if the name is "Hydro Air Fan Control"
    And  user click on the applications module
    Then verify message "Ideal Interface Between Thermostat and Air Handler" under applications




