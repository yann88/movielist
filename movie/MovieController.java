/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielist;

/**
 *
 * @author yannick
 */
public class MovieController {
    private Movie model;
    private Parser view;
    
    public MovieController(Movie model, Parser view){
        this.model=model;
        this.view=view;
        
    }
    public void setMovieTitle(String title){
        model.setTitle(title);
    }
    public String getMovieTitle(){
        return model.getTitle();
    }
    public void setMovieGenre(String genre){
        model.setGenre(genre);
    }
    public String getMovieGenre(){
        return model.getGenre();
    }
    public void setYear(int year){
        model.setYear(year);
    }
    public int getYear(){
        return model.getYear();
    }
    public void updateView(){
        
    }
    
}
