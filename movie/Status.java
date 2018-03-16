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
public class Status {
    
        public List<String> statuss = Arrays.asList("SEEN", "UNSEEN");
	private String status;

	
	public Status() {
		status = "SEEN";
	}

	
	public String getStatus() {
		return status;
	}

	
	public boolean isValidStatus(String status) {
		if (statuss.contains(status.toUpperCase())) {
			return true;
		}
		return false;
	}

	
	public boolean setStatus(String newStatus) {
		newStatus = newStatus.toUpperCase();
		if (isValidStatus(newStatus) && !newStatus.equals(status)) {
			status = newStatus;
			return true;
		} else {
			System.out.println("That's an invalid status.");
			return false;
		}

}
    
}
