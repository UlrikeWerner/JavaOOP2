package de.bookshop;

import de.bookshop.classes.Book;
import de.bookshop.classes.Library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("NK-23-6547-JF", "Der kleine Einsiedlerkrebs", "P. T. Cooper");
        Book book2 = new Book("HJ-23654-263-J","Das große Missverständnis");
        Book book3 = new Book("LR-2653-47","JUnit - Wie testet man richtig!");
        Book book4 = new Book("DT-273-78-J");
        Library ulliBookList = new Library();
        System.out.println(book1);
        System.out.println(book2);
        ulliBookList.setBookList(new Book[]{book1, book2, book3, book4});
        System.out.println(ulliBookList);
        book2.setIsbn("K3-47-H02387-g");
        book4.setAuthor("John Snow");
        book4.setTitle("Kochen für Anfänger");
        ulliBookList.setBookList(new Book[]{book1, book2, book4});
        System.out.println(ulliBookList);

        System.out.println();
        ulliBookList.addBook(new Book("25_DG-47","Java für Anfänger", "Chris Klein"));
        System.out.println(ulliBookList);
        ulliBookList.deleteBook("NK-23-6547-JF");
        System.out.println();
        System.out.println(ulliBookList);
        ulliBookList.deleteBook("DT-273-78-J");
        System.out.println();
        System.out.println(ulliBookList);

    }
}
