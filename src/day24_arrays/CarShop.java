package day24_arrays;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] args) {
		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		// Step 1. Step: Create an array of strings, and store these cars inside that
		// array.
		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla", "Ford" };
		// Step 2: Print car names that starts with M
		for (String c : cars) {
			if (!c.startsWith("M")) {
				continue;
			}
			System.out.println(c);
		}
		System.out.println("******************");
		// Step 3: Print all cars that have letter "r" somewhere in the name.
		// Please make your search case insensitive
		for (String make : cars) {
			if (make.toLowerCase().contains("r")) {
				System.out.println(make);
			}
		}
		System.out.println("******************");
		// Step 4: Print car names that ends with "a"
		for (String c : cars) {
			if (!c.endsWith("a")) {
				continue;
			}
			System.out.println(c);
		}
		System.out.println("******************");
		for (String b : cars) {
			if (b.endsWith("a")) {
				System.out.println(b);
			}
		}
		System.out.println("******************");
		// Step 5: Print all cars that have at least 6 letters in the name.
		for (String car : cars) {
			if (car.length() > 5) {
				System.out.println(car);
			}
		}
		System.out.println("******************");
		for(int i = 0; i < cars.length;i++) {
			String car = cars[i];
			if(car.length() >=6) {
				System.out.println(car);
			}
		}
		System.out.println("******************");
//		Before: BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
//		After: Tesla, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, BMW
//		Step 6: Swap first and last value in the array
//		first value: cars[i], last value: cars[cars.length-1]
		//create a temp variable, that will get a value of first element
		String temp = cars[0];
//		we swap values of first and last element
		cars[0] = cars[cars.length-1];
//		since temp variable has value of first element of array, 
//		we assign this value to the last element i the array
		cars[cars.length-1] = temp;
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(cars));
		System.out.println("Position: "+Arrays.binarySearch(cars, "Ford"));
		int num = Arrays.binarySearch(cars, "Ford");
		System.out.println("Position: "+Arrays.binarySearch(cars, num+1, cars.length-1, "Ford"));
	}
}
