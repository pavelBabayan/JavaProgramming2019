package day23_arrays_and_loops;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("this is not a prime number");
				return;
			}
		}
		System.out.println("this is a prime number");
	}
}
