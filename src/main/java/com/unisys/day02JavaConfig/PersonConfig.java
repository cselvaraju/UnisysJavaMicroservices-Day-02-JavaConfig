package com.unisys.day02JavaConfig;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class PersonConfig {
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	Person amitabh() {
		return new Person("Amitabh Bachhan", mumbai());
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
	Address mumbai() {
		return new Address("Mumbai");
	}

}
