package com.example.springbootcruddemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
    @Id
    @Column
    private int bookId;
    @Column
    private String bookName;
    @Column
    private String bookAuthor;
    @Column
    private int bookPrice;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }
}
