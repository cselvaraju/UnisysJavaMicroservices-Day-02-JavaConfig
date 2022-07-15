package com.unisys.day02JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BookConfig {

    @Bean(name = "myBook")
    Book newBook() {
        return new Book("The Grand Design", "Stephen Hawking");
    }
    
    @Bean(name = "myNovel", initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    Book secondBook() {
    	return new Book("The Carpet Beggars", "Harold Robbins");
    }

}
