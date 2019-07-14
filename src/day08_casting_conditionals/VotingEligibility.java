package day08_casting_conditionals;
import java.util.*;

public class VotingEligibility {
	public static void main(String[] args) {
		/*
		  program to tell if you are eligible to vote.
		  votingAge = 18
		  yourAge = take from scanner
		  if you are eligible to vote:
		  	you are eligible to vote.
		  	you have been eligible for 3 years
		  else
		  	you are not eligible to vote
		  	you still have 3 more years to go
		 */
		Scanner keyboard = new Scanner(System.in);
		int votingAge = 18;
		
		System.out.println("How old are you?");
		int yourAge = keyboard.nextInt();
		
		int years = yourAge - votingAge;
		
		if(yourAge >= votingAge) {
			System.out.println("You are eligible to vote.");
			//System.out.println("you have been eligible for "+years+" years");
			System.out.println("you have been eligible for "+(yourAge-votingAge)+" years");
		}else {
			int moreYears = votingAge - yourAge;
			System.out.println("you are not eligible to vote");
			//System.out.println("you still have "+(-years)+" more years to go");
			//System.out.println("you still have "+ moreYears +" more years to go");
			System.out.println("you still have "+ (votingAge-yourAge) +" more years to go");
		}
		
			
		
		
		
		
		
		
	}
}
