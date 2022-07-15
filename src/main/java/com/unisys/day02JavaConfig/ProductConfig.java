package com.unisys.day02JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

	@Bean
	Product samsungTV() {
		return new Product("TV", 1234f, samsung());
	}
	
	@Bean
	Manufacturer samsung() {
		return new Manufacturer("Samsung", "Seoul");
	}
}
