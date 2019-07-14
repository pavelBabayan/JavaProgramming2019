package day37_arraylist;
import java.util.*;
public class ArraysAsList {
	public static void main(String[] args) {
		List<String> cars = new ArrayList<>();
		cars.add("Honda"); // etc add more values
		//declare and add values in single statement
		//Arrays class
		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		//nums.add(100); will not work
		//System.out.println(nums.toString());
		
		//create arraylist prices
		//assign 10 values using Arrays.asList method
		List<Double> prices = Arrays.asList(12.4, 5.3, 500.0, 1230.50, 5.99, 
				                            12.0, 9874.44, 34.4, 123.5, 7.2); 
		System.out.println(prices);
		//calculate sum of all prices
		double sum = 0;
		for(double price : prices) {
			sum += price;
		}
		System.out.println("Sum: " + sum);
		
		double sum2 = 0;
		for(int i = 0; i < prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.println("sum2: " + sum2);
		
		//create new List<Double> called expensive 
		//add prices that are more than 100 from prices list
		List<Double> expensive = new ArrayList<>();
		
		for(double price : prices) {
			if(price > 100.0) {
				expensive.add(price);
			}
		}
		
		System.out.println("Expensive: " + expensive.toString());
		//remove all expensive prices from prices
		//prices.removeAll(expensive);		
		//System.out.println("prices: " + prices.toString());
		
	}
}





