package ait.book;

import ait.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book book1 = new Book(15698798,
                "Ein Psycholog erlebt das Konzentrationslager; Man’s Search for Meaning",
                "Viktor Frankl", 1946);
        Book book2 = new Book(589764312, "Tales of the peoples of the world", 1979);
        Book book3 = new Book(789546222, "Atlas Shrugged", "Ayn Rand", 1957);
        book1.display();
        book2.display();
        book3.display();


    }
}
