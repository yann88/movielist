/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielist;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author yannick
 */
public class Parser {
    
      private Scanner input ;
      MovieList movielist=new MovieList();
    
      public Parser(){
         input = new Scanner(System.in);
         
      }
    
      
      public void proccessing(){
          showMenu();
        boolean finished=false;  
      while (!finished){
       
          int choice = input.nextInt();
         choose(choice);
         }
      }
      
 
   public void choose(int number) {
            switch (number) {
                case 1:
                    movielist.listMovies();
                    break;
                case 2:
                    enterNewMovie();
                    break;
                case 3:
                    System.out.println("Please enter the name of the movie you want to remove");
                    String title = input.next();
                    movielist.removeMovie(title);
                    break;
                    
                case 4:
                    movielist.addCurrentMovies();
                    System.out.println("Movies loaded:....");
                    break;
                    
            }}
            
            
            


  

    


private  void enterNewMovie() {
        System.out.println("please enter movies' title");
        String genre=input.next();
        String title = input.next();
        Calendar calendar = Calendar.getInstance();
       int year = calendar.get(Calendar.YEAR);       
       
       movielist.addMovie(new Movie(genre,title,year));
       
    }
    
    
    private  void showMenu() {
        System.out.println();
        System.out.println("********************************************");
        System.out.println("Please select one of the following options: ");
        System.out.println();
        System.out.println("1 to list current movie");
        System.out.println("2 to add movie to the movielist");
        System.out.println("3 to remove a movie");
        System.out.println("4 show current movie");
        System.out.println("********************************************");
        System.out.println();
        System.out.println("Select 8 to exit");
        System.out.println();
    }
}
    

