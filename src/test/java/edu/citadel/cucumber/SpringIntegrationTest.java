package edu.citadel.main;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@CucumberContextConfiguration
@SpringBootTest
public class SpringIntegrationTest {
   @LocalServerPort
   private int port;
   private String host = "localhost";

   public TestRestTemplate testRestTemplate = new TestRestTemplate();
   public ResponseEntity<String> testRestResponse;

   public void executeGet(String endpoint) {
      String url = String.format("http://%s:%d/%s", this.host, this.port, endpoint);
      this.testRestResponse = this.testRestTemplate.getForEntity(url, String.class);
   }
}

