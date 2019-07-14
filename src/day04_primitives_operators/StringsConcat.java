package day04_primitives_operators;

public class StringsConcat {
	public static void main(String[] args) {
		//string variable called firstName and assign your firstname
		String firstName = "Murodil";
		//My name is Murodil
		System.out.println("My Name is " + firstName );
		
		//city variable and assign city where you are from
		String city = "Andijan";
		//Print: I was born in 
		System.out.println("I was born in " + city);
		
		//Create a var: job and assign SDET to it
		//Create a var: company and assign any company
		//Print: I work as <SDET> in <company>
		
		String job = "SDET";
		String company = "Google";
		System.out.println("I work as "+job+" in "+company);
		
		//create int variable zipcode and assign zipcode of your home
		//Print: I live in <22031> zipcode
		
		int zipcode = 22031;
		System.out.println("I live in "+ zipcode + " zipcode");
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1+""+num2); //1020
		
	}
}
