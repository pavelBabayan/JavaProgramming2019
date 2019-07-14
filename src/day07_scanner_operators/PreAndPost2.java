package day07_scanner_operators;

public class PreAndPost2 {
	public static void main(String[] args) {
		int messages = 10;
		messages++; //11
		++messages; //12
		System.out.println("Messages: " + messages);
		
		int readMessages = --messages;
		System.out.println("ReadMessages: " + readMessages);
		System.out.println("Messages: " + messages);
				//11				//11
		int unreadMessages = readMessages--; 
		 
		
		System.out.println("unreadMessages: " + unreadMessages);//11
		System.out.println("readMessages: " + readMessages); //10
		                //11         -  10
		int total = unreadMessages++ - readMessages--;
		
		System.out.println("unreadMessages: " + unreadMessages);//12
		System.out.println("readMessages: " + readMessages); //9
		System.out.println("total: " + total);//1
		
		int count = 20;
		int count2 = 10;
		      //30        //21  +  9
		int totalCount = ++count + --count2;
		
		System.out.println("count: "+count); //21
		System.out.println("count2: "+count2); //9
		System.out.println("totalCount: "+totalCount); //30
			//44	     //21     + (+1) + 23
		int myCount = count++ + ++count;
		
		System.out.println("count: "   + count);
		System.out.println("myCount: " + myCount);
	}
}
