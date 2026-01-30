package com.example.demo.mapper;

import com.example.demo.dto.BookDto;
import com.example.demo.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityToDto {

    public BookDto convertEntityDto(Book book){
        BookDto bookDto =new BookDto();
        bookDto.setBookId(book.getBookId());
        bookDto.setIsbn(book.getIsbn());
        bookDto.setAuther(book.getAuther());
        bookDto.setEdition(book.getEdition());
        bookDto.setGenre(book.getGenre());
        bookDto.setLanguage(book.getLanguage());
        bookDto.setPages(book.getPages());
        bookDto.setPublisher(book.getPublisher());
        bookDto.setPrice(book.getPrice());
        bookDto.setTitle(book.getTitle());
        bookDto.setStatus(book.getStatus());
        bookDto.setYearOfPublished(book.getYearOfPublished());
        return bookDto;
    }

    public List<BookDto> bookDtoList(List<Book> bookList){
        List<BookDto> bookDto=bookList.stream().map(this::convertEntityDto).toList();
        return bookDto;
    }
}
