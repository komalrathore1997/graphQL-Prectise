package com.graphql.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.learn.entity.Book;
import com.graphql.learn.service.BookService;

import lombok.Data;



@Controller
public class BookController {
     
	@Autowired
	private BookService bookservice;
	
	@MutationMapping("createBook")
	public Book create(@Argument BookInput book){ 
		Book b=new Book();
		b.setAuthore(book.getAuthore());
		b.setDescription(book.getDescription());
		b.setTitle(book.getTitle());
		b.setPrice(book.getPrice());
		b.setPages(book.getPages());
		return bookservice.create(b);
	}
	
	
	@QueryMapping("allBooks")
	public List<Book> getAll() {
		return bookservice.getAll(); 
	}
	
	@QueryMapping("getBook")
	public Book getById(@Argument int bookid) {
		return bookservice.getById(bookid);
	}
}

@Data
class BookInput{
	 private String title;
	    private String description;
	    private String authore;
	    private Long price;
	    private int pages;
}
