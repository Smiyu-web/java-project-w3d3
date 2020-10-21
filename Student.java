package w3d2;

public class Student {

	// instance variables
	private String firstName;
	private String lastName;
	private double midScore;
	private double finalScore;

	
	// default constructor

	public Student(String firstName, String lastName) {
//		if (fName == "" || lName == "") {
//			System.out.println("Invalid value");
//		} else {
//			firstName = fName;
//			lastName = lName;
//		} 
		
		if (firstName == "") {
			this.firstName = "Unknown";
	    } else {
	    	this.firstName = firstName;
	    } 
		
		if (lastName == "") {
			this.lastName = "Unknown";
        } else {
	        this.lastName = lastName;
        } 	
		
		this.midScore = 0;
		this.finalScore = 0;
		
	}
	
	// @return getter
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public double getMidScore() {
		return midScore;
	}
	
	public double getFinalScore() {
		return finalScore;
	}
	
	
	// set up setter
	
	public void setFirstName(String firstName) {
		if (firstName == "") {
			this.firstName = "Unknown";
	    } else {
	    	this.firstName = firstName;
	    } 
	}
	
	public void setLastName(String lastName) {
		if (lastName == "") {
			this.lastName = "Unknown";
        } else {
	        this.lastName = lastName;
        } 
	}
	
	public void setMidScore(double midScore) {
		this.midScore = midScore;
	}
	
	public void setfinalScore(double finalScore) {
		this.finalScore = finalScore;
	}
	
	// calculate total score and return total score
	
	public double getTotalScore () {
		return ((midScore * 30) + (finalScore * 70)) / 100;
	}
	

	
}
