Feature:As a user, I should be able to see hotel facilities at the rooms page

  @hilton
  Scenario:Verify, if the user can see all hotel facilities at the rooms page
    Given User locate to the Hilton Memphis homepage
    When  User click on rooms module
    Then  Verify hotel facilities listed below
    |  ✓ Free parking      |
    |  ✓ Non-smoking rooms |
    |  ✓ On-site restaurant|
    |  ✓ Outdoor pool      |
    |  ✓ Fitness center    |
    |  ✓ Pet-friendly rooms|







