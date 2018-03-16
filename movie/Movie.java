import java.util.HashSet;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author yannick
 */
public class Movie {

    private String genreID;
    private String title;
    private int year;
    private String rating;
    private String status;

    public Movie(String genreID, String title, int year,String rating,String Status) {
        if (year < 1900 || year > 2018) {
            throw new IllegalArgumentException(
                    "Year " + year + " out of range. Must be in the range 1900 ... 2018");
        }

        this.genreID = genreID;
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.status = status;
    }

    //TODO add set methods if needed
    public String getGenreID() {
        return genreID;
    }
    
    public void setGenre(String genreID) {
        this.genreID = genreID;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
       this.title = title;
    }

    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
       this.year = year;
    }
    public String getRating(){
        return rating;
    }
    
    public void setRating(String rating) {
     this.rating = rating;
    }
    public String getStatus(){
        return status;
    }

    public String getMovie() {
        return genreID + " " + title + " " + year + " " + rating + " " + status;
    }
    
    
    public String toString() {
        return "Genre:" + genreID + "Name: " + title + " joined in year" + year +"Rating" + rating + "status" + status;
    }

    

    }


    // public int getRating() {
    //   return rating;
    //}
    


    

    //
    //}
    
