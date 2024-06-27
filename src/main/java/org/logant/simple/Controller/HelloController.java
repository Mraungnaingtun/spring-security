

package org.logant.simple.Controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A controller for the hello resource.
 *
 * @author Josh Cummings
 */
@RestController
public class HelloController {

	@GetMapping("/")
	public String hello(Authentication authentication) {
		return "Hello, " + authentication.getName() + "!";
	}

	@GetMapping("/user")
	public String userEndpoint(Authentication authentication) {
		return "Hello, " + authentication.getName() + "!";
	}

	@GetMapping("/admin")
	public String adminEndpoint(Authentication authentication) {
		return "Hello, " + authentication.getName() + "!";
	}




}
