package de.rbaradari.model;

import java.time.YearMonth;

public class Book {

    private long id;
    private String isbn;
    private String title;
    private YearMonth releaseDate;

    public Book(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public YearMonth getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(YearMonth releaseDate) {
        this.releaseDate = releaseDate;
    }

}
