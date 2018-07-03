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
Feature: Testing the features on Personal Banking page
  These tests will verify the applications on the Personal Banking Page

  @tag1
  Scenario: Testing Checking link through the drop down
    Given PBTa The user is on personal home page
    And PBTa BANKING is present on the menu
    When PBTa cursor is placed on the BANKING menu and click on Checking link
    Then PBTa the user lands on Personal Checking Accounts page
    And PBTa Find the Right Checking Account button is present
    When PBTa the user click on Find Right Checking Account button
    Then PBTa the user lands on questionnaire page
    And PBTa First question is visible

  @tag2
  Scenario: Testing Savings link through the drop down
    Given PBTb The user is on personal home page
    And PBTb BANKING is present on the menu
    When PBTb cursor is placed on the BANKING menu and click on Savings link
    Then PBTb the user lands on PNC savings page
    And PBTb Find the right savings account is present

  @tag3
  Scenario: Testing Credit Card link through the drop down
    Given PBTc The user is on personal home page
    And PBTc BANKING is present on the menu
    When PBTc cursor is placed on the BANKING menu and click on on Credit Card link
    Then PBTc the user lands on Personal Credit Cards
    And PBTc the Compare Our Credit Cards link is present
    When PBTc the user click on Compare Credit Cards
    Then PBTc lands on Compare Credit Cards page
    And PBTc Apply options are present
    
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
