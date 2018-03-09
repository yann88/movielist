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

    private String date;
    private String title;
    private String category;
    private String status;

    public void Movie(String date, String Title, String Category, String Status) {
        this.date = date;
        this.title = title;
        this.category = category;
        this.status = status;
    }

    public String getDate(int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.YEAR, year);
        return date;
    }

    public String getTitle() {
        return title;

    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

}
