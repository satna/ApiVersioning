package com.example.demo.mapper;

import com.example.demo.dto.BookDto;
import com.example.demo.entity.Book;
import org.springframework.stereotype.Service;


@Service
public class DtoToEntity {


    public Book convertDtoToEntity(BookDto bookDto){
      Book bookObj=new Book();
      bookObj.setYearOfPublished(bookDto.getYearOfPublished());
      bookObj.setTitle(bookDto.getTitle());
      bookObj.setPublisher(bookDto.getPublisher());
      bookObj.setPrice(bookDto.getPrice());
      bookObj.setStatus(bookDto.getStatus());
      bookObj.setPages(bookDto.getPages());
      bookObj.setIsbn(bookDto.getIsbn());
      bookObj.setGenre(bookDto.getGenre());
      bookObj.setLanguage(bookDto.getLanguage());
      bookObj.setEdition(bookDto.getEdition());
      bookObj.setAuther(bookDto.getAuther());
      bookObj.setBookId(bookDto.getBookId());
      return bookObj;

    }
}
