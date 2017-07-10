/**
 * 
 */
package com.aces.learn.spring.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author aagarwal
 *
 */
@Component
public class MicroServiceConfig {
	@Value("${test.property.1}")
	private String testProperty;

	/**
	 * @return the testProperty
	 */
	public String getTestProperty() {
		return testProperty;
	}
}
