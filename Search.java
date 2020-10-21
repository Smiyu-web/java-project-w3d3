package w3d2;

import java.util.Scanner;

public class Search {
	
	public static boolean search(int[] numArr, int num) {
		// Iterate through numArr
		
		// inside the for loop check if each element equals to num
		// -> return true;
		boolean isFound = false;
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] == num) {
				isFound = true;
			}
		}
		
		// after for loop return false
		return isFound;
	}

	public static void main(String[] args) {
		// ask user "How many numbers wants to add
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers would you like to put in? ");

		// Declare array with that numbers
		int[] arr = new int[input.nextInt()]; 
		
		// Iterate through for loop and add the numbers to array
		System.out.print("add " + arr.length + " numbers : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		// ask the number from user
		System.out.print("Enter the number for searching in the array : ");
		int seachNum = input.nextInt();

		// call search method here and print the result
		boolean found = search(arr, seachNum);
		if(found) {
			System.out.print(seachNum + " is in the list");
		} else {
		System.out.print(seachNum + " is not in the list");
		}
	}

}
