package day18_while_dowhile_loops;

public class Students {
	public static void main(String[] args) {
		
		
		//using a loop , iterate until we have 10 students
		//in the room
		//Student 1
		//Student 2
		//..
		//No more space
		int numberOfStudents = 1;
		
		while(numberOfStudents <= 10) {
			System.out.println("Student "+numberOfStudents); 
			numberOfStudents++;		
		}
		System.out.println("No more space");
		
	}
}
