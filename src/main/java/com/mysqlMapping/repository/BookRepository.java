package com.mysqlMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysqlMapping.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
    public Book findByBookId(int bookId);

}
