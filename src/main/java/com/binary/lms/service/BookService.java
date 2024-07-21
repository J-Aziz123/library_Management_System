package com.binary.lms.service;

import java.util.List;
import java.util.Optional;

import com.binary.lms.model.Book;

public interface BookService {
	
	
	
public Optional<Book> findBookById(int id);
    
    public List<Book> findAllBooks();
    
    public Book saveBook(Book book);
    
    public String deleteBookById(int id);
    
    public Book updateBook(int id, Book book);
    
    

}
