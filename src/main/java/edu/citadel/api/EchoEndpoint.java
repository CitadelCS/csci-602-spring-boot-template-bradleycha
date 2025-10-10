package edu.citadel.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class EchoEndpoint {
   @GetMapping("/echo/{msg}")
   public String sayHello(@PathVariable String msg) {
      return msg;
   }
}

