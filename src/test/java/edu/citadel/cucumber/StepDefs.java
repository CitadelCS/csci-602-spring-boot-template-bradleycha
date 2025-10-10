package edu.citadel.main;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class StepDefs extends SpringIntegrationTest {
   @When("^the client calls /version$")
   public void theClientCallsVersion() throws Throwable {
      executeGet("version");
   }

   @Then("^the client receives status code of (\\d+)$")
   public void theClientReceivesStatusCodeOf(int statusCode) throws Throwable {
      // TODO: implement
   }

   @And("^the client receives server version (.+)$")
   public void theClientReceivesServerVersion(String version) throws Throwable {
      // TODO: implement
   }
}

