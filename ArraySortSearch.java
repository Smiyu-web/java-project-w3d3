package w3d2;

import java.util.Scanner;

public class ArraySortSearch {
	
	public static int[] sort(int[] numArr) {
		// create the for loop and iterate through the for loop
		// compare number[i] and number[i + 1]
		for (int i = 0; i < numArr.length - 1; i++) {
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[i] > numArr[j]) {
					int temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
		return numArr;
	}
	
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
		
		// search
		
//		// ask the number from user
//		System.out.print("Enter the number for searching in the array : ");
//		int seachNum = input.nextInt();
//
//		// call search method here and print the result
//		boolean found = search(arr, seachNum);
//		if(found) {
//			System.out.print(seachNum + " is in the list");
//		} else {
//		System.out.print(seachNum + " is not in the list");
//		}
		
		// sort
		int[] sorted = new int[arr.length];
		sorted = sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(sorted[i] + " ");
		}
		
	}

}
