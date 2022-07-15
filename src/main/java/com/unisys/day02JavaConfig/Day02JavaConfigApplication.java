package com.unisys.day02JavaConfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Day02JavaConfigApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Day02JavaConfigApplication.class, args);
		
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(BookConfig.class);
//		
//		// Getting bean by id -> The config bean method name is the id of the bean
//		Book book = (Book) ctx.getBean("myBook");
//		
//		
//		System.out.println(book);
		

//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		
//		ctx.register(BookConfig.class);
//		ctx.refresh();
//		Book book = (Book) ctx.getBean("myBook");
//		System.out.println(book);

//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProductConfig.class);
//		Product tv = (Product) ctx.getBean("samsungTV");
//		System.out.println(tv);
		
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		Book book = (Book) ctx.getBean("myBook");
//		System.out.println(book);
//		Product myTV = (Product) ctx.getBean("samsungTV");
//		System.out.println(myTV);
		
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		Book book = (Book) ctx.getBean("myNovel");
//		System.out.println(book);

//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		Book book1 = (Book) ctx.getBean("myNovel");
//		Book book2 = (Book) ctx.getBean("myNovel");
//		System.out.println(book1.hashCode());
//		System.out.println(book2.hashCode());
//		
//		book1 = book2 = null;
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Person p1 = (Person) ctx.getBean("amitabh");
		Person p2 = (Person) ctx.getBean("amitabh");
		
		p1.display();
		p2.display();
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
