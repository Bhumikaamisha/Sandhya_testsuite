Feature:Checking the search functionality working as per expected
  Scenario: Logged user is able search the item and add to the basket for checkout
    Given:user is on homepage
    When user types "lego" in the search bar
    And clicks on "search" button
    And clicks on "LEGO 31058 Mighty Dinosaurs Building Toy" link
    And user clicks on "Add to basket" button
    Then user is able to see the item in the basket as "Added to Basket"


