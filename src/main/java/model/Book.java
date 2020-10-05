package model;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;
    private String BorrowedWith;

    public Book(int id, String title, String author, boolean isBorrowed, String borrowedWith) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
        BorrowedWith = borrowedWith;
    }

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getBorrowedWith() {
        return BorrowedWith;
    }

    public void setBorrowedWith(String borrowedWith) {
        BorrowedWith = borrowedWith;
    }
}
