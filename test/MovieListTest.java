/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yannick
 */
public class MovieListTest {
    
    public MovieListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getList method, of class MovieList.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        MovieList instance = new MovieList();
        List<Movie> expResult = null;
        List<Movie> result = instance.getList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setList method, of class MovieList.
     */
    @Test
    public void testSetList() {
        System.out.println("setList");
        List<Movie> list = null;
        MovieList instance = new MovieList();
        instance.setList(list);
        
    }

    /**
     * Test of addMovie method, of class MovieList.
     */
    @Test
    public void testAddMovie() {
        System.out.println("addMovie");
        Movie movie = null;
        MovieList instance = new MovieList();
        instance.addMovie(movie);
        
    }

    /**
     * Test of removeMovie method, of class MovieList.
     */
    @Test
    public void testRemoveMovie() {
        System.out.println("removeMovie");
        Movie movie = null;
        MovieList instance = new MovieList();
        instance.removeMovie(movie);
        
    }

    /**
     * Test of getMovie method, of class MovieList.
     */
    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        int id = 4;
        MovieList instance = new MovieList();
        Movie expResult = null;
        Movie result = instance.getMovie(id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSize method, of class MovieList.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        MovieList instance = new MovieList();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeWatched method, of class MovieList.
     */
    @Test
    public void testRemoveWatched() {
        System.out.println("removeWatched");
        MovieList instance = new MovieList();
        instance.removeWatched();
        
    }

    /**
     * Test of toString method, of class MovieList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MovieList instance = new MovieList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
