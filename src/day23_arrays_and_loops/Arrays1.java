package day23_arrays_and_loops;

public class Arrays1 {
	public static void main(String[] args) {
		int[] numbers = new int[3];

		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		// assign to the first element in the array value of num1
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;

		numbers[0] = 7;
		numbers[1] = 8;
		// we cannot provide different data type, we have to use data type of an array
		// numbers[2] = "A";
		numbers[1] = 'A';
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println("*****************");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// maximum size of an array Integer.MAX_VALUE-5
		byte[] bytesArray = new byte[3];

		String[] names = new String[5];
		// size = to number of items
		String[] names2 = { "Shaun", "Roman", "Vlad", "Burak", "James" };

		System.out.println(names2[4]);
		System.out.println("Number of items: " + names2.length);
		String[] countries = { "" };
		// double[] values =
		// ARRAY HAS FIXED SIZE
		countries[0] = "USA";
		// String name = null;
		String[] fruits = new String[] { "apple", "orange" };
		// for each loop stands for collections of data
		// we need specify data type, variable name : our collection of data
		//for each loop
		// or enhanced loop
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		String[] contries;
		contries = new String[5];
		countries[0] = "USA";
		

	}
}
