import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book;
    private Book book1;
    private Book book2;

    private Library library;

    @Before
    public void SetUp() {
        library = new Library(2);
        book = new Book("The Twits", "Roald Dahl", "Childrens");
        book1 = new Book( "The Way of All Flesh", "Ambrose Parry", "Crime");
        book2 = new Book("Past Tense", "Lee Child", "Fiction");
    }

    @Test
    public void numberOfBooks() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void addBook() {
        library.addBooks(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void cantAddBooks() {
        library.addBooks(book);
        library.addBooks(book1);
        library.addBooks(book2);
        assertEquals(2, library.countBooks());
    }



    }
