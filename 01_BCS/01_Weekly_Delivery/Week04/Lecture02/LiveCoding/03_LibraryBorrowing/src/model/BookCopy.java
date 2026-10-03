package model;
public class BookCopy {
    private final String copyId;
    private final Book book;
    private boolean available=true;
    public BookCopy(String copyId, Book book) { this.copyId=copyId; this.book=book; }
    public String getCopyId() { return copyId; }
    public Book getBook() { return book; }
    public boolean isAvailable() { return available; }
    public boolean tryBorrow() {
        // TODO 1: reject if unavailable; otherwise set available=false and return true.
        return false;
    }
}
