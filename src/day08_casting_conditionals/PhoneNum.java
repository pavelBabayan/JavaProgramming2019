package day08_casting_conditionals;

import java.util.*;

public class PhoneNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your area code:");
		int areaCode = scan.nextInt();
		
		System.out.println("Enter local number");
		int localNumber = scan.nextInt();
		//long longlocalNumber = scan.nextLong();
		// (303)-2364587
		String phoneNumber = "("+areaCode+")-"+localNumber;
		
		System.out.println("Calling number " + phoneNumber);
		
		
		
	}
}
