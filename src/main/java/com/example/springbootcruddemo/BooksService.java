package com.example.springbootcruddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {
    @Autowired
    BooksRepository booksRepository;

    //getting all books record by using the method findAll() of crudRepository
    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<>();
        booksRepository.findAll().forEach(books::add);
        return books;
    }

    // getting a specific record by using the method findById() of crudRepository
    public Books getBooksById(int id) {
        return booksRepository.findById(id).get();
    }

    // saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }

    // deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id) {
        booksRepository.deleteById(id);
    }

    // updating a record
    public void update(Books books) {
        booksRepository.save(books);
    }
}
