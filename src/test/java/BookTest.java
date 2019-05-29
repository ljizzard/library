import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("The Twits", "Roald Dahl", "Childrens");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Twits", book.getTitle() );
    }

    @Test
    public void hasAuthor() {
        assertEquals("Roald Dahl", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Childrens", book.getGenre());
    }
}
