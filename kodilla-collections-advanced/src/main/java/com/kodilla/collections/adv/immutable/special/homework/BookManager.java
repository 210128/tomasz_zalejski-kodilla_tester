package com.kodilla.collections.adv.immutable.special.homework;


import java.util.HashSet;
import java.util.Set;

public class BookManager {
    Set<Book> books = new HashSet<>();

    public Book createBook(String title, String author) {


        books.add(new Book(title, author));  /*TODO Review - 2 objects are created in theis method, please:
        1. create 1 object Book
        2. add it to the list
        3. return it*/

        return new Book(title, author);
    }

    public void displayBooks() {
        for (Book book : books)
            System.out.println(book);
    }
}
