Feature:Checking the homepage have all the expected features
  @Sandy1
  Scenario:Major links are visible
    Given User is on the home page
    When he clicks on "Christmas Store" link
    Then he should be landed on page with text "The Christmas Store"
    When user navigates back