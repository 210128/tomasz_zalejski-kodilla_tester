package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager book = new BookManager();
        Book inferno = book.createBook("Inferno", "Dan Brown");
        Book witcher = book.createBook("Witcher", "Andrzej Sapkowski");
        Book tengu = book.createBook("Tengu", "Graham Masterton");
        Book inferno1 = book.createBook("Inferno", "Dan Brown");
        Book witcher1 = book.createBook("Witcher", "Andrzej Sapkowski");

        System.out.println(inferno.equals(inferno1));
        System.out.println(inferno == inferno1);
        System.out.println(witcher.equals(witcher1));
        System.out.println(witcher == witcher1);
        System.out.println(inferno.equals(tengu));
        System.out.println(inferno == tengu);
        book.displayBooks();


    }
}
