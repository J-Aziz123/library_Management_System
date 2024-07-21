package com.binary.lms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binary.lms.dao.BookRepository;
import com.binary.lms.exceptions.BookNotFoundException;
import com.binary.lms.model.Book;
import com.binary.lms.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Optional<Book> findBookById(int id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public String deleteBookById(int id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            return "Book deleted with id: " + id;
        } else {
            throw new BookNotFoundException("Book not found with id: " + id);
        }
    }

    @Override
    public Book updateBook(int id, Book book) {
        if (bookRepository.existsById(id)) {
            book.setId(id);
            return bookRepository.save(book);
        } else {
            throw new BookNotFoundException("Book not found with id: " + id);
        }
    }
}
