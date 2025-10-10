package edu.citadel.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionEndpoint {
   @GetMapping("/version")
   public String getVersion() {
      return "1.0";
   }
}

