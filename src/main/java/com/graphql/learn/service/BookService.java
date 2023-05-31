package com.graphql.learn.service;

import java.util.List;

import com.graphql.learn.entity.Book;

public interface BookService {

	  Book create(Book book);
      
      List<Book> getAll();
      
      Book getById(int id);
}
