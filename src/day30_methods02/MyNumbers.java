package day30_methods02;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {
	public static void main(String[] args) {
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
//		while(true) {
//			showMe5Numbers();
//		}
		
		do10PushUps(); 
		do10PushUps();	
		rangePrint();
		rangePrint();
		rangePrint();
	}
	/**
	 method name: showMe5Numbers
     return type: void
     params: no
     prints 5 random numbers 0, 1000
     in same line separated by comma
     Ex:
     showMe5Numbers(); 345 233 566 2 23
	 */
	public static void showMe5Numbers() {
		Random r = new Random();
		for(int i = 1; i <= 5; i++) {
			System.out.print(r.nextInt(1001)+" ");//print random num 0-1000
		}
		System.out.println();//take it to new line
	}
	
	/*
	 * name: do10PushUps
	   return type: void
	   params: no
	   print:
	   Pushup - 1
	   Pushup - 2
	   Pushup - 3
	   ..
	   Pushup - 10
	   Time to rest
	 */
	public static void do10PushUps() {
		for(int j = 1; j <= 10; j++) {
			System.out.println("Pushup - " + j);
		}
		System.out.println("Time to rest");
	}
	
	/*
	   method name: rangePrint
       return type: void
       params/args: no
       Using a scanner ask for 2 integers.
       you need to print all numbers between those to numbers.
	 */
	
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 nums:");
		int num1 = scan.nextInt(); //6
		int num2 = scan.nextInt(); //3 
		
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i +" ");
			}
		}else if(num1 > num2) {
			for(int k = num1; k >= num2; k--) {
				System.out.print(k+" ");
			}
		}else {
			System.out.println(num1);
		}
		System.out.println();
	}
	
}
