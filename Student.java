package w3d2;

public class Student {

	// instance variables
	private String firstName;
	private String lastName;
	
	
	// default constructor

	public Student(String fName, String lName) {
//		if (fName == "" || lName == "") {
//			System.out.println("Invalid first name");
//		} else {
//			firstName = fName;
//			lastName = lName;
//		} 
		
		if (fName == "") {
			firstName = "Unknown";
	    } else {
	    	firstName = fName;
	    } 
		
		if (lName == "") {
			lastName = "Unknown";
        } else {
	        lastName = lName;
        } 	
	}
	
	// @return getter
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	// set up setter
	
	public void setFirstName(String fName) {
		if (fName == "") {
			firstName = "Unknown";
	    } else {
	    	firstName = fName;
	    } 
	}
	
	public void setLastName(String lName) {
		if (lName == "") {
			lastName = "Unknown";
        } else {
	        lastName = lName;
        } 
	}
	
}
