package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDto {

    //private Long id;
    private String bookId;
    private String title;

    public String getBookId() {
        return bookId;
    }

    public BookDto setBookId(String bookId) {
        this.bookId = bookId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BookDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public BookDto setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public BookDto setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public String getAuther() {
        return auther;
    }

    public BookDto setAuther(String auther) {
        this.auther = auther;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public BookDto setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getEdition() {
        return edition;
    }

    public BookDto setEdition(String edition) {
        this.edition = edition;
        return this;
    }

    public String getYearOfPublished() {
        return yearOfPublished;
    }

    public BookDto setYearOfPublished(String yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public BookDto setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public BookDto setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Long getPages() {
        return pages;
    }

    public BookDto setPages(Long pages) {
        this.pages = pages;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public BookDto setStatus(String status) {
        this.status = status;
        return this;
    }

    private Double price;
    private String isbn;
    private String auther;
    private String publisher;
    private String edition;
    private String yearOfPublished;

    private String genre;
    private String language;
    private Long pages;
    private String status;

}
