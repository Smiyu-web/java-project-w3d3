package w3d2;

public class Book {

	private String title;
	private String firstName;
	private String lastName;
	private int year;
	private double price;
	
	public Book(String bookTitle, String firstNameAuthor, String lastNameAuthor, 
			int publishedYear, double price) {
		if (bookTitle == "" || bookTitle == null) {
			title = "Unknow";
		} else {
			title = bookTitle;
		}
		
		if (firstNameAuthor == "" || firstNameAuthor == null) {
			firstName = "Unknow";
		} else {
			firstName = firstNameAuthor;
		}
		
		if (lastNameAuthor == "" || lastNameAuthor == null) {
			lastName = "Unknow";
		} else {
			lastName = lastNameAuthor;
		}

		if (publishedYear >= 1900) {
			year = publishedYear;
		} else {
		    year = 1900;
		}
		
		if (price <= 0) {
			this.price = 0;
		} else {
			this.price = price;
		}
	}
	
	// return getter
	
	public String getTitle(){
		return title;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	public int getYear(){
		return year;
	}
	
//	public double getPrice() {
//		return price;
//	}
	
	public double getPrice() {
		return price * 1.12;
	}
	
	// set up
	public void setTitle(String bookTitle) {
		if (bookTitle == "" || bookTitle == null) {
			title = "Unknow";
		} else {
			title = bookTitle;
		}
	}
	
	public void setFirstName(String firstNameAuthor) {
		if (firstNameAuthor == "" || firstNameAuthor == null) {
			firstName = "Unknow";
		} else {
			firstName = firstNameAuthor;
		}
	}
	
	public void setLastName(String lastNameAuthor) {
		if (lastNameAuthor == "" || lastNameAuthor == null) {
			lastName = "Unknow";
		} else {
			lastName = lastNameAuthor;
		}
	}
	
	public void setYear(int publishedYear) {
		if (publishedYear >= 1900) {
			year = publishedYear;
		} else {
		    year = 1900;
		}
	}
	
	public void setPrice(double price) {
		if (price <= 0) {
			this.price = 0;
		} else {
			this.price = price;
		}
	}

}
