package day17_stringpool_whileloop;

public class WhileLoop1 {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 140;
		
		while(n2 > n1) { //true
			System.out.println("N2 is greater");
		}
		
		System.out.println("END");
		
		//THE ABOVE LOOP IS INFINITE LOOP.
		//THE CONDITION (n2 > n1) WILL ALWAYS BE TRUE, AND NEVER BECOMES
		//FALSE.
		//WHILE LOOP KEEPS EXECUTION AS LONG AS THE CONDITION IS/STAYS
		//TRUE
		
	}
}
