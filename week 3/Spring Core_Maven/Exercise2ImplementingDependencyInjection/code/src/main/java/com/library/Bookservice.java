package com.library;


public class Bookservice {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void display() {
        
        System.out.println("In Bookservice display method");
        bookRepository.displaymethod();
    }
}
