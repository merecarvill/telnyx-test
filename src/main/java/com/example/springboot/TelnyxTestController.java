package com.example.springboot;

import com.telnyx.sdk.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelnyxTestController {

	@GetMapping("/")
	public String index() {
		// this throws the following error: java.lang.ClassNotFoundException: javax.ws.rs.core.Configuration
		Configuration.getDefaultApiClient();
		return "It worked";
	}

}
