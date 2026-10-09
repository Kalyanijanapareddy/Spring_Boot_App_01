package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;

import com.example.demo.repo.BookRepo;
import com.example.demo.entity.Book;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(Application.class, args);
		BookRepo repo= ctxt.getBean(BookRepo .class);
		
		/*Book b=new Book();
		
		b.setBookId(101);
		b.setBookName("Spring");
		b.setBookPrice(1000.0);
		repo.save(b);
		System.out.println("Record Inserted");*/
		
		
		Optional<Book>findById=repo.findById(101);
		System.out.println(findById.get());
		ctxt.close();
		
	}

}
