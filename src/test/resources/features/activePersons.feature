Feature: Active Persons in PA
  Scenario: Search for Active Persons in PA
    Given I click on Persons Menu Option
    When I select Active from Status
    Then I click on Search
    Then I assert Person(s) matches Person(s)
    Then I click on Logout