package day24_arrays;

public class CheckFirstAndLastValue {
	public static void main(String[] args) {
		// write a program that will print true
		// if first and last value in the array of ints
		// are same - print true
		// final int length = 6;
		int[] numbers = { 2, 41, 213, 21, 42, 2 };
		// .length <- it's not a method, it's a instance variable (property)
		boolean equals = numbers[0] == numbers[numbers.length - 1];
		System.out.println(equals);
		System.out.println(numbers[0] == numbers[numbers.length - 1]);
		if (numbers[0] == numbers[numbers.length - 1]) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
