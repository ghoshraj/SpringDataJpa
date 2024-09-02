package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.entity.Book;
import com.raj.repo.BookRepo;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
				SpringApplication.run(SpringDataJpaApplication.class, args);
		
		BookRepo repo = ctx.getBean(BookRepo.class);
		
		Book book = new Book();
		book.setName("SQL");
		book.setPrice(299.0);
		
		repo.save(book);
	}
}
