import java.util.ArrayList;
import java.util.List;

public class MovieList {
    private List<Movie> list = new ArrayList<>();

    public List<Movie> getList() {
        return list;
    }

    public void setList(List<Movie> list) {
        this.list = list;
    }

    public void addMovie(Movie movie) {
        list.add(movie);
    }

    public void removeMovie(Movie movie) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(movie)) {
                list.remove(i);
            }
        }
    }

    public Movie getMovie(int id) {
        if (id <= list.size()) {
            return list.get(id);
        } else {
            return null;
        }
    }

    public int getSize() {
        return list.size();
    }


    public void removeWatched() {
        List<Movie> watched = new ArrayList<>();
        for (Movie movie : list) {
            if (!movie.isSeen()) {
                watched.add(movie);
            }
        }

        for (Movie movie : watched) {
            watched.remove(movie);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movie movie : list) {
            sb.append(movie.toString());
            sb.append("\n");
        }
        return sb.toString();
    }


}
