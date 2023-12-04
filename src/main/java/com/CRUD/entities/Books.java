package com.CRUD.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "BOOK Managment")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String BookName;
    private int Sr_No;
    private String WriterName;


    public Books(Long id, String bookName, int sr_No, String writerName) {
        Id = id;
        BookName = bookName;
        Sr_No = sr_No;
        WriterName = writerName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getSr_No() {
        return Sr_No;
    }

    public void setSr_No(int sr_No) {
        Sr_No = sr_No;
    }

    public String getWriterName() {
        return WriterName;
    }

    public void setWriterName(String writerName) {
        WriterName = writerName;
    }
}
