package com.example.demo.repo;

import com.example.demo.dto.BookDto;
import com.example.demo.entity.Book;

import java.util.List;

public interface BookServiceRepo {

    public List<BookDto> getlistOfBook();
    public BookDto getBookById(String id);
    public String updateBookDetails(String id, BookDto book);
    public String addNewBook(BookDto book);
    public String addListOfBook(List<BookDto> bookList);
    public String removeBookById(String id);

}
