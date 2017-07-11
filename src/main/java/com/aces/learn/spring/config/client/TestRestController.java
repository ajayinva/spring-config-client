/**
 * 
 */
package com.aces.learn.spring.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aagarwal
 *
 */
@RestController
public class TestRestController {
	@Autowired
	private MicroServiceConfig microServiceConfig;
	
	@RequestMapping("/property")
	public String getTestProperty(){
		String value = microServiceConfig.getTestProperty(); 
		return "<H1>"+value+"</H1>";
	}
}
