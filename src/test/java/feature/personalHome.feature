#Author: breakit2make@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Testing the features on Personal Home page
  These tests will verify the applications on the Personal Home Page

  @tag1
  Scenario: Testing Checking link
    Given PHTa The user is on personal home page
    And PHTa checking link is present
    When PHTa click on Checking link
    Then PHTa the user lands on Personal Checking Accounts page
    And PHTa Find the Right Checking Account button is present
    When PHTa the user click on Right Checking Account button
    Then PHTa the user lands on questionnaire page
    And PHTa First question is visible

  @tag2
  Scenario: Testing Credit Cards link
    Given PHTb The user is on personal home page
    And PHTb credit cards link is present
    When PHTb the user click on crdit cards link
    Then PHTb the user lands on Personal Credit Cards
    And PHTb the Compare Our Credit Cards link is present
    When PHTb the user click on Compare Credit Cards
    Then PHTb lands on Compare Credit Cards page
    And PHTb Apply options are present

  @tag3
  Scenario: Testing Savings link
    Given PHTc The user is on personal home page
    And PHTc Saving link is present
    When PHTc the user click on Savings link
    Then PHTc the user lands on PNC savings page
    And PHTc Find the right savings account is present
    
    #refer https://docs.cucumber.io/gherkin/reference/#scenario-outline
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
