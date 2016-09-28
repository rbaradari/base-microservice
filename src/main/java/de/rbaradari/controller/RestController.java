package de.rbaradari.controller;

import java.time.Month;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.stereotype.Component;

import de.rbaradari.model.Book;

@Component
@Path("/book")
public class RestController {

    @GET
    List<Book> listBooks() {
        return Arrays.asList(
                buildBook(1, "443546545645", "How to Code", 2012, Month.APRIL),
                buildBook(2, "5435345435", "Tom Sawyer", 2012, Month.JULY),
                buildBook(3, "765765765", "My Little Pony", 2012, Month.FEBRUARY),
                buildBook(4, "5345435", "Armageddon", 2012, Month.SEPTEMBER),
                buildBook(5, "35345435", "The Bible", 2012, Month.AUGUST));
    }

    @GET
    @Path("{id}")
    Book getBook(@PathParam("id") long id) {
        return buildBook(id, "12343534-" + id, "My Little Pony", 2012, Month.APRIL);
    }

    private Book buildBook(long id, String isbn, String title, int year, Month month) {
        Book book = new Book(id);
        book.setIsbn(isbn);
        book.setReleaseDate(YearMonth.of(year, month));
        book.setTitle(title);

        return book;
    }
}
