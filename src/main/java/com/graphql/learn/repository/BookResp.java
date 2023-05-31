package com.graphql.learn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.learn.entity.Book;

@Repository
public interface BookResp extends JpaRepository<Book, Integer>{
     
       
}