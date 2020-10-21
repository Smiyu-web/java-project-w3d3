package w3d2;

public class Driver {
	
	public static void printStudents(Student[] studentArr) {
		for (int i = 0; i < studentArr.length; i++) {
			System.out.println(studentArr[i].getFirstName() + " " + studentArr[i].getLastName());
		}
	}
	
	public static void printBook(Book[] bookArr) {
		for (int i = 0; i < bookArr.length; i++) {
			System.out.println(bookArr[i].getTitle() + " " + bookArr[i].getFirstName() + " " + bookArr[i].getLastName() 
					+ " " + bookArr[i].getYear());
		}
	}

	public static void main(String[] args) {
		// Student
		Student[] studentArray = new Student[3];
	
		studentArray[0] = new Student("", "Doe");
		studentArray[1] = new Student("Jone", "Dew");
		studentArray[2] = new Student("Albert", "Dao");
		
		studentArray[0].setFirstName("Erica");
		
		printStudents(studentArray);
		
		
//		if(student1.firstName != null || student1.lastName != null) {
//			System.out.println(student1.firstName + " " + student1.lastName);
//		}

//		System.out.println(student1.getFirstName() + " " + student1.getLastName());
//		System.out.println(student2.getFirstName() + " " + student2.getLastName());
		
		// Book
		Book book[] = new Book[3];
		book[0] = new Book("", "A", "B", 1789);
		book[1] = new Book("ABC", "Emily", "Kaa", 1900);
		book[2] = new Book("1234", "John", "Hoo", 2010);
		
		book[0].setTitle("Hello");
		
		printBook(book);


//		System.out.println(book1.getTitle() + " " + book1.getFirstName() + " " + book1.getLastName()
//				+ " " + book1.getYear());

		
	}

}
 