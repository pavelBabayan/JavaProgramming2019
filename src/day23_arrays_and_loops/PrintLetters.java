package day23_arrays_and_loops;

public class PrintLetters {
	public static void main(String[] args) {
		//outer loop will repeat printing of letter as many times as want
		//in this case we are gonna print 3 times
		//so we are running inner loop 3 times	
		for (int i = 1; i <= 10; i++) {
			//i -- it's an index
			//if index is even (it means 2,4,6,8...), print from z till a
			if(i%2==0) {
				for (char letter = 'a'; letter <= 'z'; letter++) {
					System.out.print(letter);	
				}
			//if index is odd (it means 1, 3, 5....), print from z till a
			} else {
				for (char letter = 'z'; letter >= 'a'; letter--) {
					System.out.print(letter);	
				}
			}
			System.out.println();
			System.out.println("**************************");
		}
	}
}
