package movielist;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieList {

private    ArrayList<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void listMovies() {
        System.out.println("numbers of movies: " + movies.size());
        movies.forEach(m -> System.out.println(m + "\n"));
    }

    public void removeMovie(String title) {
        Optional<Movie> optional = movies.stream().filter(m -> m.getTitle().equals(title)).findFirst();
        if (optional.isPresent()) {
            Movie movie = optional.get();
            movies.remove(movie);
            System.out.println("removed movie: " + movie);
        } else {
            System.out.println("Movie: " + title + "doesn't exist");
        }
    }
        public void addCurrentMovies() {
       movies.add(new Movie("Comedy","la foire",1992));
       }
}
       // public void updateMovies();
//}

//      
