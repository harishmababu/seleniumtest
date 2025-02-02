Feature: Dashboard visibility

  Scenario Outline: User successfully views the dashboard
    Given the user is logged into the visitapp using "<username>" and "<password>"
    When the user navigates to the dashboard page
    Then the dashboard should be displayed with relevant data
    And the user click add new visit
    And successfully add new visit
 Examples: 
      | username | password |
      |  manager1@ictkerala.org | @manager#952 |
      
      