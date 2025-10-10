Feature: ask the server to repeat what you sent
   Scenario: client makes call to GET /echo/test123
      When the client calls /echo/test123
      Then the client receives status code of 200
      And the client receives server response test123

   Scenario: client makes call to GET /echo/wat
      When the client calls /echo/wat
      Then the client receives status code of 200
      And the client receives server response wat

