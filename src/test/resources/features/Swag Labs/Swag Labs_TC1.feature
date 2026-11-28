Feature: SwagLabs_TC_1

  Scenario Outline: SwagLabs_TC_1
    Given User navigates to the home page
    Then User enters username '<Username>'
    And User enters password '<Password>'
    And User click on the login button
    And User select the product category '<Category>'
    Then User select the product
      | 2              |
    And User click on the cart
    And User validate the price
    And User click on the checkout button
    Then User enter details
      | Jason          |
      | Ryan           |
      | 12345          |
    And User click on the continue button
    And User click on the finish button
    And User click on the back home button
    And User click on the menu button
    And User click on the logout button

    Examples:
      | Username         | Password     | Category              |
      | standard_user    | secret_sauce | Name (Z to A)         |


    # run in terminal
    # mvn clean verify
    # to execute the bdd script

    # Miss out requirement