package com.kodilla.collections.adv.immutable;

public class ImmutableExample {

    public static void main(String[] args) {

        Book book = new BookHacked("John Stewart", "The last chance");
        BookHacked bookHacked = (BookHacked) book;

        bookHacked.modifyTitle("New title");
        System.out.println(book.getTitle());

        Book book1 = new Book("Stephen King", "Salem's lot");
        System.out.println(book1.getTitle());
    }
}
