import java.util.Date;

public class Movie {
    private boolean seen;
    private String name;
    private String genre;
    private Date date;

    public Movie(String name,String genre) {
        this(name,genre, null);
    }

    public Movie(String name,String genre,Date date) {
        this(name, genre, date, true);

    }


    public Movie(String name, String genre, Date date, boolean seen) {
        this.seen = seen;
        this.name = name;
        this.genre = genre;
        this.date = date;


    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isSeen()) {
            sb.append("[(*)");
        } else {
            sb.append("[ ");
        }
        sb.append(genre);
        sb.append(name);
        if (date != null) {
            sb.append("(date)");
        }
        sb.append("  ]");
        return sb.toString();
    }

    public boolean isSeen() {
        if (seen == true) {
            return true;
        } else {
            return false;
        }
    }



    public void toggleState() {
        seen = !seen;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Date getDate() {
        return date;
    }

}

