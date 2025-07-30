package com.llb.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "23-SB-WELCOME-API")
public interface WelcomeApiClient {

	@GetMapping("/welcome/msg")
	public String invokeWelcomeApi();
	
}
