package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

    private String bookId;
    private String title;
    private Double price;
    private String isbn;
    private String auther;
    private String publisher;
    private String edition;
    private String yearOfPublished;

    public String getBookId() {
        return bookId;
    }

    public Book setBookId(String bookId) {
        this.bookId = bookId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Book setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public Book setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public String getAuther() {
        return auther;
    }

    public Book setAuther(String auther) {
        this.auther = auther;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getEdition() {
        return edition;
    }

    public Book setEdition(String edition) {
        this.edition = edition;
        return this;
    }

    public String getYearOfPublished() {
        return yearOfPublished;
    }

    public Book setYearOfPublished(String yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Book setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Book setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Long getPages() {
        return pages;
    }

    public Book setPages(Long pages) {
        this.pages = pages;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Book setStatus(String status) {
        this.status = status;
        return this;
    }

    private String genre;
    private String language;
    private Long pages;
    private String status;


    public Book(String bookId, String title, Double price, String isbn,
                String auther, String publisher, String edition,
                String yearOfPublished, String genre, String language,
                Long pages, String status) {

        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.isbn = isbn;
        this.auther = auther;
        this.publisher = publisher;
        this.edition = edition;
        this.yearOfPublished = yearOfPublished;
        this.genre = genre;
        this.language = language;
        this.pages = pages;
        this.status = status;
    }
}
