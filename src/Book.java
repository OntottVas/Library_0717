import java.util.HashSet;
import java.util.Set;

public class Book {
    private Set<String> authors;
    private String title;
    private int releaseYear;
    private Genre genre;

    public Book(String author, String title, int releaseYear, Genre genre) {
        this.authors = new HashSet<>();
        this.authors.add(author);
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public void addAuthor(String author) {
        this.authors.add(author);
    }


}
