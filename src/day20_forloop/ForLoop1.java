package day20_forloop;

public class ForLoop1 {
	public static void main(String[] args) throws InterruptedException {
		// Using for loop print "Love Java!" 10 times
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Love Java!");
		}
		
		//For loop - print 5 to 15
		for(int i = 5; i <= 15; i++) {
			System.out.println(i);
		}
		
		//For loop - print 20 - 10 
		for(int num = 20; num >= 10; num--) {
			System.out.print(num +" ");
			Thread.sleep(456);
		}
		
	}
}





