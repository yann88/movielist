/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yannick
 */
    public class Genre
{
    public String genreID;
    public String genreName;



    public Genre(String genreID, String genreName)
    {
        this.genreID = genreID;
        this.genreName = genreName;
    }

    
    public String getGenreID() 
    {
        return genreID;
    }

    public void setGenreID(String genreID)
    {
        this.genreID = genreID;
    }

    public String getGenreName()
    {
        return genreName;
    }

    public void setGenreName(String genreName)
    {
        this.genreName = genreName;
    }
    
}