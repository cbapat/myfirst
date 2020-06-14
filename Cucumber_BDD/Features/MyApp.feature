Feature: Test Facebook smoke scenario

  Scenario Outline: Test Login with credentials
    Given Open Chrome and start app
    When "<UserName>" and "<Password>" is entered
    Then User should be able to login

    Examples: 
      | UserName                    | Password   |
      | chintamani.bapat1@gmail.com | Password@1 |
      | chintamani.bapat2@gmail.com | Password@2 |
      | chintamani.bapat3@gmail.com | Password@3 |
