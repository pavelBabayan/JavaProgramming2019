package day24_arrays;

public class ArrayOfChars {
	public static void main(String[] args) {
		char[] values = { 'a', 'b', 'c' };
		for (char value : values) {
			System.out.println(value);
		}
		
		String str = "Wooden spoon";
		// this ,method toCharArray() converts string into
		// array of characters
		char[] chars = str.toCharArray();
		for(char c:chars){
			System.out.print(c);
		}
		System.out.println();
		str = "";
		for(int i = chars.length-1;i>=0;i--) {
			str+=chars[i];
		}
		System.out.println(str);
		System.out.println();
//		TASK
//		Print characters with help of array of characters, one by one 
//		if character is equals to 'o', 
//		replace it with '*' (print it instead of 'o') ;
		for(char c: chars) {
			if(c == 'o') {
				System.out.print("*");
			}else {
				System.out.print(c);
			}
		}
		System.out.println();
		char[] newChars = new char[3];
		System.out.println("Value of char: "+newChars[0]);
		System.out.println(newChars[0] + 0);
			
	}
}
