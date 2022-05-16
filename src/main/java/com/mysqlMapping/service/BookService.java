package com.mysqlMapping.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mysqlMapping.entity.Book;

@Service
public interface BookService {
	
    public Book saveBook(Book book);
    public Book findByBookId(int bookId);

}
