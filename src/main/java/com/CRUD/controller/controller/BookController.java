package com.CRUD.controller.controller;

import com.CRUD.entities.Books;
import com.CRUD.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Books create(@RequestBody Books books){
        return bookService.add(books);
    }

    @GetMapping
    public List<Books> getall(){
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Books getbyId(@PathVariable Long id){
        return bookService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deletbyid(@PathVariable Long id){
        bookService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateById(@PathVariable Long id ,@RequestBody Books updatebooks){
        bookService.updateById(id,updatebooks);
        return ResponseEntity.ok("Update successfully");
    }


}