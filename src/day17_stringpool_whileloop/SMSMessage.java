package day17_stringpool_whileloop;
import java.util.*;
public class SMSMessage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
//Sender:<Bob Jones>. From Number:[703-534-9874]. Message:{Hey, whats up! Lets code some java!}
		
		String sender = message.substring( message.indexOf("<")+1  , message.indexOf(">") );
		System.out.println("Sender: " + sender);
		String phoneNumber=message.substring( message.indexOf("[")+1  , message.indexOf("]") );
		System.out.println("Phone Number: "+phoneNumber);
		String messageBody=message.substring( message.indexOf("{")+1  , message.indexOf("}") );
		System.out.println("Message body: "+messageBody);
		
	}
}	
