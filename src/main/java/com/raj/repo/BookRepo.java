package com.raj.repo;

import org.springframework.data.repository.CrudRepository;

import com.raj.entity.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {

}
