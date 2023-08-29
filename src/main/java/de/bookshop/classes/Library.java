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

    public void addBook(Book book){
        Book[] newBookList = new Book[this.bookList.length + 1];
        System.arraycopy(this.bookList, 0, newBookList, 0, this.bookList.length);
        newBookList[this.bookList.length] = book;
        this.bookList = newBookList;
    }

    public void deleteBook(String isbn){
        Book[] newBookList = new Book[this.bookList.length - 1];
        int index = 0;
        for(Book book : this.bookList){
            if(isbn.equals(book.getIsbn())){
                continue;
            }
            newBookList[index] = book;
            index++;
        }
        this.bookList = newBookList;
    }
}
