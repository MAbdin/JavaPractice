/*
 * Make a program which displays a different message depending on the age given. 
 * Here are the possible responses:
age is less than 16, say "You can't drive."
age is less than 18, say "You can't vote."
age is less than 25, say "You can't rent a car."
age is 25 or over, say "You can do anything that's legal."
 */

import java.util.*;

public class HowOldAreYou {

	public static void main(String[] args) {
		
		//initialize variables
		String name;
		int age;
		
		//initialize scanner
		Scanner scan = new Scanner(System.in);
		
		//ask user for name and age
		System.out.print("Hey, what's your name? ");
		name = scan.nextLine();
		
		System.out.print("Ok, " +name+ " how old are you?");
		age = scan.nextInt();
		
		if(age < 16) {
			System.out.print("You can't drive.");
		}
		
		if(age < 18) {
			System.out.println("You can't vote.");
		}
		
		if(age < 25) {
			System.out.println("You can't rent a car.");
		}
		
		if(age > 25) {
			System.out.println("You can do anything that's legal.");
		}
		scan.close();
	}

}
