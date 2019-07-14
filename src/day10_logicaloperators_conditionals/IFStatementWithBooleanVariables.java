package day10_logicaloperators_conditionals;

public class IFStatementWithBooleanVariables {
	public static void main(String[] args) {
		boolean  isBreakTime = false;
		if(isBreakTime == true) {
			System.out.println("BREAK TILL 8:38 PM");
		}else {
			System.out.println("Not Break time yet.");
		}
		
	//second version
		if(isBreakTime) {
			System.out.println("BREAK TILL 8:38 PM");
		}else {
			System.out.println("Not Break time yet.");
		}
		
		boolean classTime = false;
		
		if(classTime) {
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			System.out.println("Pay Attention");
			System.out.println("Code and have fun!");
		}else {
			System.out.println("Take a walk and have some water.");
		}
		
		boolean qualified = false;
		//send a notification message only if not qualified
		//we need to check if qualified variable contains FALSE
		      //true
		if(qualified == false) {
			System.out.println("You application was not approved. Thank you");
		}
	}
}




