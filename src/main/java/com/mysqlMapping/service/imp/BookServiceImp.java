package com.mysqlMapping.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysqlMapping.entity.Book;
import com.mysqlMapping.entity.Story;
import com.mysqlMapping.repository.BookRepository;
import com.mysqlMapping.service.BookService;

@Service
public class BookServiceImp implements BookService {
	
	 @Autowired
	 private BookRepository bookRepository;
	 public Book saveBook(Book book) {
		 List<Story> storyList = new ArrayList<>();
	     // create first story
	     Story story1 = new Story();
	     story1.setStoryName("Arrays");
	     // create second story
	     Story story2 = new Story();
	     story2.setStoryName("Pointers");
	     // create third story
	     Story story3 = new Story();
	     story3.setStoryName("Loops");
	     // add all story into storyList. Till here we have prepared data for OneToMany
	     storyList.add(story1);
	     storyList.add(story2);
	     storyList.add(story3);
	     // Prepare data for ManyToOne
	     story1.setBook(book);
	     story2.setBook(book);
	     story3.setBook(book);
	     book.setStoryList(storyList);
	     book = bookRepository.save(book);
	     return book;


	 	}
		@Override
		public Book findByBookId(int bookId) {
			return bookRepository.findByBookId(bookId);
		}
}	
