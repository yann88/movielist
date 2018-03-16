

import java.util.ArrayList;
import java.util.*;

public class MovieList {

private    ArrayList<Movie> movies;

public MovieList(){
   ArrayList<Movie> movies=new ArrayList<>();
   movies.add(new Movie("drama","Citizen Kane",1998,"HIGH","SEEN"));
   movies.add(new Movie("drama","Casablanca",1990,"MEDIUM","UNSEEN"));
   movies.add(new Movie( "drama","The Godfather",1995,"HIGH","SEEN"));
    
}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	
	public Movie getMovie() {
		Random r = new Random();
		return movies.get(r.nextInt(movies.size()));
	}

	
	public boolean addMovie(Movie newMovie) {
		if (newMovie.length() > 0 && !movies.contains(newMovie)) {
			return movies.add(newMovie);
		}
		return false;
	}

	
	public boolean removeMovie(Movie movie) {
		return movies.remove(movie);
	}
        
	
	public boolean removeAllMovie() {
		movies = new ArrayList<>();
		return movies.isEmpty();
	}
}

    