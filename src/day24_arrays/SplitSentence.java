package day24_arrays;

public class SplitSentence {
	public static void main(String[] args) {
		int counter = 0;
		String setence = "Java is a general-purpose computer-programming "
						+ "language that is concurrent, class-based, object-oriented, "
						+ "and specifically designed to have as "
						+ "few implementation dependencies as possible.";
		String[] words = setence.split(" ");
		for(String str: words) {
			if(str.equals("is")) {
				break;
			}
			counter++;
		}
		System.out.println("Position: "+counter);
		System.out.println(words[counter]);
		
	}
}
