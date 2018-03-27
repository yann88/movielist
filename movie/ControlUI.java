import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class ControlUI {
    private MovieList movieList;
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


    public ControlUI(MovieList movieList) {
        this.movieList = movieList;
    }

    public void run() {
        while (true) {
            switch (showMenu()) {
                case ADD_MOVIE:
                    addMovie();
                    break;
                case REMOVE_MOVIE:
                    removeMOVIE();
                    break;
                case CHANGE_MOVIE_STATE:
                    changeMovieState();
                    break;
                case REMOVE_WATCHED_MOVIES:
                    removeWatchedMovies();
                    break;
                case PRINT_MOVIES:
                    printMovies();
                    break;
                case EXIT:
                    return;

            }
        }
    }

    private void addMovie() {
        System.out.println("Enter Movie: ");
        String name = readLine();
        String genre = readLine();
        System.out.println("Released (MM,dd,yyyy): ");
        String date = readLine();

        if (date.length() < 1) {
            System.out.println("Date not specified.");
            movieList.addMovie(new Movie(name, genre));
        } else {
            try {
                DateFormat format = new SimpleDateFormat("MM,dd,yyyy", Locale.ENGLISH);
                Date dat = null;
                dat = format.parse(date);
                movieList.addMovie(new Movie(genre, name, dat));
            } catch (ParseException e) {
                System.err.println("Error while parsing the date" + e);
            }
        }
    }

    private void removeMOVIE() {
        System.out.println("Enter index: ");
        try {
            int index = Integer.parseInt(readLine());
            Movie movie = movieList.getMovie(index);
            movieList.removeMovie(movie);
        } catch (NumberFormatException ex) {
            System.err.println("Only numbers are allowed");
        }
    }

    private void changeMovieState() {
        System.out.println("Enter index: ");
        try {
            int index = Integer.parseInt(readLine());
            Movie movie = movieList.getMovie(index);
            movie.toggleState();
        } catch (NumberFormatException ex) {
            System.err.println("Only numbers are allowed");
        }
    }

    private void removeWatchedMovies() {
        movieList.removeWatched();
        System.out.println("watched movies have been removed");
    }

    private void printMovies() {
        if (movieList.getSize() != 0) {
            System.out.println(movieList.toString());
        } else {
            System.out.println("List is empty.");
        }
    }

    private Option showMenu() {
        System.out.println("Menu.");
        for (Option option : Option.values()) {
            System.out.printf("%d. %s%n", option.ordinal() + 1, option);
        }
        System.out.println("-----------------------------------------------");

        int selection = -1;
        do {
            System.out.println("Option: ");
            selection = Integer.parseInt(readLine());
        } while (selection <= 0 || selection > Option.values().length);

        return Option.values()[selection - 1];
    }

    private String readLine() {
        try {
            return input.readLine();
        } catch (IOException e) {
            return null;
        }

    }

    public enum Option {
        ADD_MOVIE, REMOVE_MOVIE, CHANGE_MOVIE_STATE, REMOVE_WATCHED_MOVIES, PRINT_MOVIES, EXIT
    }
}
