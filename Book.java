package w3d2;

public class Book {

	private String title;
	private String firstName;
	private String lastName;
	private int year;
	
	public Book(String bookTitle, String firstNameAuthor, String lastNameAuthor, int publishedYear) {
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

		if (year < 1900) {
			year = 1900;
		} else {
		    year = publishedYear;
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
		if (year < 1900) {
			year = 1900;
		} else {
		    year = publishedYear;
		}
	}

}
