package com.unisys.day02JavaConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BookConfig.class, ProductConfig.class, PersonConfig.class})
public class ApplicationConfig {

}
