package com.llb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llb.entities.Book;
import com.llb.repositories.BookRepo;

@Service
public class BookService {
	
	private BookRepo bookRepo;

	@Autowired
	public BookService(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public void saveBook() {
		Book book = new Book();
		
		book.setBookName("Abhimanyu");
		book.setBookPrice(356.00);
		
		bookRepo.save(book);
		
		System.out.println("Book Saved...");
	}
	
	

}
