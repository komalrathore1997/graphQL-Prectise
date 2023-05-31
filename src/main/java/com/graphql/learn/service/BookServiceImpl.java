package com.graphql.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphql.learn.entity.Book;
import com.graphql.learn.repository.BookResp;

@Service	
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookResp bookrepo;

	@Override
	public Book create(Book book) {
		
		return this.bookrepo.save(book);
	}

	@Override
	public List<Book> getAll() {
		
		return bookrepo.findAll();
	}

	@Override
	public Book getById(int id) {
		
		return bookrepo.findById(id).orElseThrow(()-> new RuntimeException("Book you are finding not parsent in server"));
	}

}
