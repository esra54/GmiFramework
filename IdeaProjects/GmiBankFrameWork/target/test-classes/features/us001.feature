Feature:    System should allow any user to register with valid credentials
  validating the success message
  Background:Home Page
    Given  User on the home page "gmibankurl"
    And    User goes to iconAccountMenu and navigates registration page

  @registrationwithvalidvalues
  Scenario: US01_TC01 System should allow any user to register with valid credentials
  validating the success message

    Then  User provides a valid "SSN"
    Then  User provides a valid Firstname
    Then  User provides a valid Lastname
    Then  User provides a valid Address
    Then  User provides a valid Mobile Phone Number
    Then  User provides a valid Username "Usernamee"
    Then  User provides a valid Email
    Then  User provides a valid Password "Password"
    Then  User provides a valid Password to Password confirmation textbox
    Then  User clicks on Register button
    And   User validates that registration is done succesfully

  @registrationwithfakervalues
  Scenario Outline: US001_TC02 Success registration with valid credentials with java faker

    Then User provides a valid SSN with javafaker as "<ssn>"
    Then User provides a valid Firstname with javafaker as "<firstname>"
    Then User provides a valid Lastname with javafaker as "<lastname>"
    Then User provides a valid Address with javafaker as "<address>"
    Then User provides a valid Mobile Phone Number with javafaker as "<mobilephone>"
    Then User provides a valid Username with javafaker as "<username>"
    Then User provides a valid Email with javafaker as "<email>"
    Then User provides a valid Password with javafaker as "<firstpassword>"
    Then User provides a valid Password to Password confirmation textbox with javafaker as "<secondpassword>"
    Then User clicks on Register button and validates that with a success message as "<message>"


    Examples:
      | ssn | firstname | lastname | address | mobilephone | username | email | firstpassword | secondpassword | message |
      |     |           |           |         |            |          |       |               |                |         |

