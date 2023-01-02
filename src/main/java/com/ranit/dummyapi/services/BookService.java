package com.ranit.dummyapi.services;

import com.ranit.dummyapi.dao.BookRepository;
import com.ranit.dummyapi.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    
    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>) this.bookRepository.findAll();
        return list;
    }

    //get a book by id
    public Book getBookById(int bookId) {
        Book book = null;
        try {
            book = this.bookRepository.findById(bookId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    //add a book
    public Book addBook(Book b) {
        Book result = bookRepository.save(b);
        return result;
    }

    //update a book
    public void updateBookById(Book book, int bookId) {
        book.setId(bookId);
        bookRepository.save(book);
    }

    //delete a book
    public void deleteBookById(int bookId) {
        bookRepository.deleteById(bookId);
    }
}
