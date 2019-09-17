/*
 * Write an interactive quiz. 
 * It should ask the user three multiple-choice or true/false questions about something. 
 * It must keep track of how many they get wrong, and print out a "score" at the end.
 */

import java.util.*;
public class A_Little_Quiz {

	public static void main(String[] args) {
		
		String ready;
		int correct = 0;
		int total = 3;
		int answer1, answer2, answer3;
		
		//initialize scanner
		Scanner scan = new Scanner(System.in);
		
		//ask if the user is ready for a quiz.  
		System.out.print("Are you read for a quiz? (Y/N) ");
		ready = scan.next();
		
		if (ready.equals("Y")) {
			System.out.println("Okay, here it comes!");
			
			System.out.print("Q1) What is the capital of Alaska? "
					+ "\n\t1) Melbourne\n\t2) Anchorage\n\t3) Juneau");
			
				answer1 = scan.nextInt();
				
					if (answer1 == 3) {
						System.out.println("That's right!");
						correct++;
					}
					else {
						System.out.println("You are wrong, the answer is 3) Juneau");
					}
			
			System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?"
					+ "\n\t1) yes\n\t2) no");
				
				answer2 = scan.nextInt();
					
				if (answer2 == 2) {
					System.out.println("That's right!");
					correct++;
				}
				else {
					System.out.println("You are wrong, the answer is 2) no");
					
				}
				
				System.out.println("Q3) What is the result of 9+6/3?"
						+ "\n\t1) 5\n\t2) 11\n\t3) 15/3");
					
					answer3 = scan.nextInt();
						
					if (answer3 == 2) {
						System.out.println("That's right!");
						correct++;
					}
					else {
						System.out.println("You are wrong, the answer is 2) 11");
						
					}			
					
			System.out.println("Overall, you got " + correct + " out of "+ total + " correct\nThanks for playing!");
				
		}
		else if (ready.equals("N")) {
			System.out.print("Maybe next time.");
		}
		else {
			System.out.print("Error");
		}
		
			
	}

}
