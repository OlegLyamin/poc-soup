package com.epam.poc;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class BookServiceImpl implements BookService {

    private BookRepository bookRepository = new BookRepository();
    @Override
    public GetBookResponse getBook(GetBook parameters) {
        GetBookResponse getBookResponse = new GetBookResponse();
        Book book = bookRepository.findBook(parameters.getID());
        getBookResponse.setBook(book);

        return getBookResponse;
    }

    @Override
    public AddBookResponse addBook(AddBook parameters) {
        return null;
    }

    @Override
    public GetAllBooksResponse getAllBooks(GetAllBooks parameters) {
        GetAllBooksResponse getAllBooksResponse = new GetAllBooksResponse();
        getAllBooksResponse.setAllBooks(bookRepository.getAllBooks());
        return getAllBooksResponse;
    }
}
