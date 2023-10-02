package ait.book.model;

/*
Создать класс Book в пакете ait.book.model. В этом классе определить поля:
 private long isbn; private String title; private String author;
 private int yearOfPublishing;
 Создать конструкторы для иницализации всех полей, и конструктор для инициализации полей
 при отсутствии автора. Остальные конструкторы на Ваше усмотрение.
 Создать геттеры и сеттеры, исходя из логики и необходимости.
 Создать метод public void display() для печати в консоль информации о книге.
Создать класс BookAppl в пакете ait.book с методом main.
В методе main создать несколько экземпляров Book и вывести для каждого из них результат работы метода display.
 */
public class Book {
    private long isbn;
    private String title;
    private String author;
    private int yearOfPublishing;

    public Book(long isbn, String title, String author, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book(long isbn, String title, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        author = "without author";
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
    public void setIsbn(long isbn) {
        this.isbn = checkIsbn(isbn);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    private long checkIsbn(long isbn) {
        if (isbn >= 1_000_000_000_000L && isbn <= 9_999_999_999_999l) {
            return isbn;
        }
        return -1;
    }


    public void display() {
        System.out.println("ISBN:\t" + isbn + "\nTitle:\t" + title +
                "\nAuthor:\t" + author + "\nYearOfPublishing:\t" + yearOfPublishing);
        System.out.println("========================================");
    }
}
