package com.ranit.dummyapi.dao;

import com.ranit.dummyapi.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    public Book findById(int id);
}
