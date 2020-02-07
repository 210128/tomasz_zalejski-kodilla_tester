package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book = new BookManager("Shining", "Stephen King");
        Book book1 = new BookManager("Inferno", "Dan Brown");
        Book book2 = new BookManager("Witcher", "Andrzej Sapkowski");
        Book book3 = new BookManager("Tengu", "Graham Masterton");
        Book book4 = new BookManager("Inferno", "Dan Brown");

        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book4.hashCode());

    }
}
