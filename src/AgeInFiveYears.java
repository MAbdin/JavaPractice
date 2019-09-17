import java.util.*;
public class AgeInFiveYears {

	public static void main(String[] args) {
		
	//initialize variables
		String name;
		int age; //current age
		int oldAge; //age 5 years prior
		int newAge; //age 5 years in the future

	//initialize scanner
		Scanner scan = new Scanner(System.in);
		
	//get full name
		System.out.print("Hello.  What is your name? ");
		name = scan.next();
		
		System.out.print("Hi, " + name + "!  How old are you? ");
		age = scan.nextInt();
	
	//determine age five years ago and age five years in the future
		oldAge = age - 5;
		newAge = age + 5;
		
		System.out.print("Did you know that in five years you will be "+newAge+" years old?\n"
				+ "And five years ago you were "+oldAge+"! Imagine that!");
	}

}
