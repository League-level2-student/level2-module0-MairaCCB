package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] names = { "Maira", "Sofie", "Eme", "Nikki", "Amelia" };

		// 2. print the third element in the array
		System.out.println(names[2]);

		// 3. set the third element to a different value
		names[2] = "Chloe";

		// 4. print the third element again
		System.out.println(names[2]);

		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 6. make an array of 50 integers
		int[] numbers = new int[50];

		// 7. use a for loop to make every value of the integer array a random number
		for (int a = 0; a < numbers.length; a++) {
			Random r = new Random();
			numbers[a] = r.nextInt(50);
		}

		// 8. without printing the entire array, print only the smallest number in the
		// array
		System.out.println("0");

		// 9 print the entire array to see if step 8 was correct
		int large = numbers[0];
		for (int x = 0; x < 50; x++) {
			System.out.println(numbers[x]);
			if (large > numbers[x]) {
				System.out.println();
			}
		}

		// 10. print the largest number in the array.
		System.out.println("49");

	}
}
