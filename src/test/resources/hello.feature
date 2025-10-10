Feature: ask the server to say hello
   Scenario: client makes call to GET /hello
      When the client calls /hello
      Then the client receives status code of 200
      And the client receives server response Hello!

