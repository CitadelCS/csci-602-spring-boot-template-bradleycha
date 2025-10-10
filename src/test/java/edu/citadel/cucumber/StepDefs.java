package edu.citadel.main;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import static org.junit.Assert.assertEquals;

public class StepDefs extends SpringIntegrationTest {
   @When("^the client calls /(.+)$")
   public void theClientCallsVersion(String url) throws Throwable {
      executeGet(url);
   }

   @Then("^the client receives status code of (\\d+)$")
   public void theClientReceivesStatusCodeOf(int statusCodeExpected) throws Throwable {
      int statusCodeReceived = this.testRestResponse.getStatusCode().value();
      assertEquals(statusCodeReceived, statusCodeExpected);
   }

   @And("^the client receives server version (.+)$")
   public void theClientReceivesServerVersion(String versionExpected) throws Throwable {
      String versionReceived = this.testRestResponse.getBody();
      assertEquals(versionReceived, versionExpected);
   }
}

