import java.util.HashSet;
import java.util.Set;

public class Book {
    private final Set<String> authors = new HashSet<>();
    private String title;
    private final int releaseYear;
    private final Genre genre;

    public Book(String author, String title, int releaseYear, Genre genre) {
        this.authors.add(author);
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public Set<String> getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Genre getGenre() {
        return genre;
    }

    public void addAuthor(String author) {
        this.authors.add(author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + authors +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", genre=" + genre +
                '}';
    }




}
