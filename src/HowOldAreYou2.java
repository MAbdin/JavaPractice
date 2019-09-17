//Using if statements, else if, and else statements, 
//make a program which displays a different message
//depending on the age given.

import java.util.*;
public class HowOldAreYou2 {

	public static void main(String[] args) {
		
		//initialize variables
		String name;
		int age;
		
		//initialize scanner
		Scanner scan = new Scanner(System.in);
		
		//ask user for their name and age
		System.out.print("Hey, what's your name?  (Sorry, I keep forgetting.) ");
		name = scan.nextLine();
		
		System.out.print("Ok, "+name+", how old are you? ");
		age = scan.nextInt();
		
		if (age < 16) {
			System.out.print("You can't drive");
		}
		else if (age >= 16 && age <=17) {
			System.out.print("You can drive but not vote");
		}
		else if (age >= 18 && age <=24) {
			System.out.print("You can vote but not rent a car");
		}
		else {
			System.out.print("You can do pretty much anything.");
		}
		scan.close();
	}

}
