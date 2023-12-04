package com.CRUD.services.impl;

import com.CRUD.entities.Books;
import com.CRUD.repository.BookRepository;
import com.CRUD.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Override
    public Books add(Books books) {
        return bookRepository.save(books);
    }

    @Override
    public List<Books> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Books getById(Long id) {
        return bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Books not found"));
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void updateById(Long id, Books updatebooks) {

       Books books1= bookRepository.findById(id).orElse(null);

       if (books1 !=null){
           books1.setBookName(updatebooks.getBookName());
           books1.setWriterName(updatebooks.getWriterName());
           books1.setSr_No(updatebooks.getSr_No());

           bookRepository.save(books1);
       }

    }
}
