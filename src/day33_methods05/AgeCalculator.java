package day33_methods05;
/*
 * age -> negative -> invalid age
  	age -> 1 - 14  -> child
   	age -> 15 - 25 -> youngster
	age -> 26 - 64 -> adult
	age -> 65 > -> senior
 */
public class AgeCalculator {
	public static void main(String[] args) {
		int age=calculateAge(1994);
		System.out.println("You are "+age+" years old");
		
		int age2 = calculateAge(1975);
		System.out.println("You are "+age2+" years old");
		
		System.out.println( calculateAge(2025) );
		
	}
	/*
	 * method is calculating the age
	 * print category
	 * return age value
	 * -->if age is negative print "invalid age" and return 0
	 */
	public static int calculateAge(int year) {
		int currentYear = 2019;
		int age = currentYear - year;
		if(age < 0) {
			System.out.println("Invalid Age!");
			return 0;
		}else if(age >=0 && age <= 14) {
			System.out.println("child");
		}else if(age >= 15 && age <= 25) {
			System.out.println("youngster");
		}else if(age >= 26 && age <= 64) {
			System.out.println("adult");
		}else {
			System.out.println("senior");
		}
		
		return age;
	}
}
