package com.example.demo.service;

import com.example.demo.dto.BookDto;
import com.example.demo.entity.Book;
import com.example.demo.mapper.DtoToEntity;
import com.example.demo.mapper.EntityToDto;
import com.example.demo.repo.BookRepository;
import com.example.demo.repo.BookServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImp implements BookServiceRepo {
    private BookRepository bookRepo;

    BookServiceImp(BookRepository bookRepo){
        this.bookRepo=bookRepo;
    }
    @Autowired
    private EntityToDto entityToDto;

    @Autowired
    private DtoToEntity dtoToEntity;

    @Override
    public List<BookDto> getlistOfBook() {
        List<Book> bookList=bookRepo.findAll();

        return entityToDto.bookDtoList(bookList);
    }

    @Override
    public BookDto getBookById(String id) {
      Book book=  bookRepo.getByBookId(id);
        BookDto dto=entityToDto.convertEntityDto(book);
        return dto;
    }

    @Override
    public String updateBookDetails(String id, BookDto book) {

        return null;
    }

    @Override
    public String addNewBook(BookDto book) {
        Book book1=dtoToEntity.convertDtoToEntity(book);
        Book savedBook= bookRepo.save(book1);

        return "Save Details";
    }

    @Override
    public String addListOfBook(List<BookDto> bookList) {
        if(!bookList.isEmpty()){
            for (BookDto bookDto:bookList){
                this.addNewBook(bookDto);
            }
        }

        return "List has saved !!!";
    }

    @Override
    public String removeBookById(String id) {
        return null;
    }
}
