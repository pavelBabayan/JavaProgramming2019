package day06_operators2;

public class MinutesToHours {
	public static void main(String[] args) {
		int minutes = 135;
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		
		System.out.println(hours);
		System.out.println(remainingMinutes);
		//"5 hours and 10 minutes"
		System.out.print(minutes+" minutes is ");
		System.out.println(hours + " hours and "+remainingMinutes+" minutes");
		
	}
}
