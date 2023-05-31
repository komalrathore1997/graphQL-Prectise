package com.graphql.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphql.learn.entity.Book;
import com.graphql.learn.service.BookService;

@SpringBootApplication
public class GraphQlProjectApplication implements CommandLineRunner{

	@Autowired
	private BookService bookservice;
	public static void main(String[] args){
		SpringApplication.run(GraphQlProjectApplication.class, args);
	}

	@Override 
	public void run(String... args) throws Exception {
		
		Book b1=new Book();
		b1.setTitle("Complete Reference");
		b1.setDescription("ForLearningJava");
		b1.setPages(20000);
		b1.setPrice(5000L);
		b1.setAuthore("XYZ");
		
		Book b2=new Book();
		b2.setTitle("Think JAVA");
		b2.setDescription("ForLearningJava with Graph Ql");
		b2.setPages(15000);
		b2.setPrice(5000L);
		b2.setAuthore("ZYX");
		
		Book b3=new Book();
		b3.setTitle("Head first to JAVA");
		b3.setDescription("learinging Graph Ql");
		b3.setPages(1000);
		b3.setPrice(2000L);
		b3.setAuthore("KYC");
		
		
		bookservice.create(b1);
		bookservice.create(b2);
		bookservice.create(b3);
		
	}

}
