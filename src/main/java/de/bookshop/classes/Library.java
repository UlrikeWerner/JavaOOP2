package de.bookshop.classes;

import java.util.Arrays;

public class Library {
    private Book[] bookList;

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] books) {
        this.bookList = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookList=" + Arrays.toString(bookList) +
                '}';
    }
}
