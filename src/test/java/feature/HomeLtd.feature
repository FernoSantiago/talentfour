Feature: Create new users
  In order to create new users
  As a email user
  I want to have access to the email

  @tag1
  Scenario Outline: Show success message when create user with all information filled
    And I have access in the page
    And I fill in the name field with "<name>"
    And I fill in the last name field with "<last_name>"
    And I fill in the user name field with "<user_name>"
    And I fill in the password field with "<password>"
    And I fill in the confirm password field with "<confirm_pass>"
    And I click on next button at modal create acount google
    And I fill in the phone field with "<phone>"
    And I click on next button at modal check phone
    And I fill in the verification code field with "<verification_code>"
    And I click on check button at motal of verification
    And I fill in the day field with "<day>"
    And I select in the month field with "<month>"
    And I fill in the year field with "<year>"
    And I select in the genre field with "<genre>"
    And I click on next button at modal welcome
    And I click on yes button
    When I click on I agree button
    Then I should see a welcome message

    Examples: 
      | name     | lastname   | user_name          | password       | confirm_pass   | phone_number | verification_code | day | month   | year | genre             |
      | fernando | talentfour | fernandotalentfour | talentfour@123 | talentfour@123 |  11931526792 |            012345 |  03 | Janeiro | 1979 | Prefiro não dizer |
