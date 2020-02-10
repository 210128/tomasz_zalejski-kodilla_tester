package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager book = new BookManager();
        book.createBook("Inferno", "Dan Brown");
        book.createBook("Witcher", "Andrzej Sapkowski");
        book.createBook("Tengu", "Graham Masterton");
        book.createBook("Inferno", "Dan Brown");
        book.createBook("Witcher", "Andrzej Sapkowski");

book.displayBooks();



    }
}
