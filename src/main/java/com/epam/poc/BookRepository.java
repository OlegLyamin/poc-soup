package com.epam.poc;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

public class BookRepository {

    private static final Map<String, Book> books = new HashMap<>();

    public BookRepository() {
        initData();
    }

    public void initData() {
        Book book1 = new Book();
        book1.setAuthor("Oleg1");
        book1.setID("Id1");
        book1.setTitle("How to survive with SOUP 1");

        books.put(book1.getID(), book1);

        Book book2 = new Book();
        book2.setAuthor("Oleg2");
        book2.setID("Id2");
        book2.setTitle("How to survive with SOUP 2");

        books.put(book2.getID(), book2);

        Book book3 = new Book();
        book3.setAuthor("Oleg3");
        book3.setID("Id3");
        book3.setTitle("How to survive with SOUP 3");

        books.put(book3.getID(), book3);

        Book book4 = new Book();
        book4.setAuthor("Oleg4");
        book4.setID("Id4");
        book4.setTitle("How to survive with SOUP 4");

        books.put(book4.getID(), book4);
    }

    public Book findBook(String id) {
        Assert.notNull(id, "The book's id must not be null");

        return books.get(id);
    }

    public Map<String, Book> getAllBooks() {
        return books;
    }
}
