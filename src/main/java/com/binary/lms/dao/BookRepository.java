package com.binary.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.binary.lms.model.Book;

@Repository
	public interface BookRepository extends CrudRepository<Book, Integer> {

}
