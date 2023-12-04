package com.CRUD.services;

import com.CRUD.entities.Books;

import java.util.List;

public interface BookService {

    Books add(Books books);

    List<Books> getAll();

    Books getById(Long id);

    void delete(Long id);

    void updateById(Long id, Books books);

}