package com.scarlatti.app;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

public class Lib2AutoConfig {

	// todo can this have @ConfigurationProperties?
	@Bean
	@ConditionalOnMissingBean
	public Lib2 lib2() {
		return new Lib2();
	}
}
