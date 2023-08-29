package de.bookshop;

import de.bookshop.classes.Book;
import de.bookshop.classes.Library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Der kleine Einsiedlerkrebs", "P. T. Cooper", "NK236547JF");
        Book book2 = new Book("Das große Missverständnis", "Anna Lang");
        Book book3 = new Book("JUnit - Wie testet man richtig!");
        Book book4 = new Book();
        Library ulliBookList = new Library();
        System.out.println(book1);
        System.out.println(book2);
        ulliBookList.setBookList(new Book[]{book1, book2, book3, book4});
        System.out.println(ulliBookList);
        book2.setIsbn("K347H02387g");
        book4.setAuthor("John Snow");
        book4.setTitle("Kochen für Anfänger");
        ulliBookList.setBookList(new Book[]{book1, book2, book4});
        System.out.println(ulliBookList);
    }
}
