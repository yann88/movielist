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
public class Main {

    static MovieList movie = new MovieList();

    static Scanner input = new Scanner(System.in);

    private static void enterNewMovie() {
        System.out.println("please enter movies' title");
        String title = input.next();
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
    }

    private static void showMenu() {
        System.out.println();
        System.out.println("********************************************");
        System.out.println("Please select one of the following options: ");
        System.out.println();
        System.out.println("1 to list current movie");
        System.out.println("2 to add movie to the movielist");
        System.out.println("3 to remove a movie");
        System.out.println("********************************************");
        System.out.println();
        System.out.println("Select 8 to exit");
        System.out.println();
    }

    public static void main(String[] args) 
    {
        //Main m = new Main();

        while (true) {
            showMenu();
            String selected = input.next();
            int selectedNumber;
            try {
                selectedNumber = Integer.parseInt(selected);
            } catch (NumberFormatException e) {
                System.out.println("please insert valid input");
                continue;
            }
            if (selectedNumber == 8) {
                break;
            }
            switch (selectedNumber) {
                case 1:
                    movie.listMovies();
                    break;
                case 2:
                    enterNewMovie();
                    break;
                case 3:
                    System.out.println("Please enter the name of the movie you want to remove");
                    String title = input.next();
                    movie.removeMovie(title);
                    break;

            }
        }

    }
}
