import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yannick
 */
public class Rating {
    public List<String> ratings = Arrays.asList("HIGH", "LOW", "MEDIUM");
	private String rating;

	
	public Rating() {
		rating = "HIGH";
	}

	
	public String getRating() {
		return rating;
	}

	
	public boolean isValidStatus(String status) {
		if (ratings.contains(status.toUpperCase())) {
			return true;
		}
		return false;
	}

	
	public boolean setRating(String newRating) {
		newRating = newRating.toUpperCase();
		if (isValidStatus(newRating) && !newRating.equals(rating)) {
			rating = newRating;
			return true;
		} else {
			System.out.println("That's an invalid rating.");
			return false;
		}

}
    
    
}
