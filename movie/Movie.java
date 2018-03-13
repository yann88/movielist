/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielist;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author yannick
 */
public class Movie {

    private String genre;
    private String title;
    private int year;
    // private int rating;
    //private String status;

    public Movie(String genre, String title, int year) {
        if (year < 1900 || year > 2018) {
            throw new IllegalArgumentException(
                    "Year " + year + " out of range. Must be in the range 1900 ... 2018");
        }

        this.genre = genre;
        this.title = title;
        this.year = year;
        //this.rating = rating;
        //this.status = status;
    }

    //TODO add set methods if needed
    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
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

    public String getMovie() {
        return genre + " " + title + " " + year;
    }
    
    public String toString() {
        return "Genre:" + genre + "Name: " + title + " joined in year" + year;
    }
}

    // public int getRating() {
    //   return rating;
    //}
//    public String setDate(//) {
////        Calendar cal = Calendar.getInstance();
////        cal.set(Calendar.MONTH, month);
////        cal.set(Calendar.YEAR, year);
//        return date;
//    }
    // public String getStatus() {
    //   return status;
    //}
    


    

    //public void setRating(int rating) {
    //  this.rating = rating;
    //}
    
