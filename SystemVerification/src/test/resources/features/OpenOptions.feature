Feature: System Verification Home Page

  @title
  Scenario:
    Given I am on the Home Page
    When I click Careers from tabs
    And I click Open Options from Careers tab
    Then Check Open Options Page verify url

  @SelectCategory
  Scenario: Checking of Location Category from Open Options Page
    Given First step click Careers from tabs
    When Second step click Open Options from Careers tab
    Then I select Hamburg on Category