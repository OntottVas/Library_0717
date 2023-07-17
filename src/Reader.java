import java.util.HashSet;
import java.util.Set;

public class Reader {
    private String name;
    private int readerTicket;
    private Set<Genre> favoriteGenres;

    public Reader(String name, int readerTicket, Genre favorieGenre) {
        this.name = name;
        this.readerTicket = readerTicket;
        this.favoriteGenres = new HashSet<>();
        this.favoriteGenres.add(favorieGenre);
    }

    public String getName() {
        return name;
    }

    public int getReaderTicket() {
        return readerTicket;
    }

    public Set<Genre> getFavoriteGenres() {
        return favoriteGenres;
    }

    public void addGenre(Genre genre) {
        this.favoriteGenres.add(genre);
    }

    public void removeGenre(Reader reader, Genre genre) {

    }
}
