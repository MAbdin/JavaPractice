//import the scanner library
import java.util.*;

public class userInfo {

	public static void main(String[] args) {
		

		//initialize name, age, salary variables
		String name;
		int age;
		double salary;
		
		//initialize the scanner
		Scanner scan = new Scanner(System.in);
		
		//use the scanner to input name
		System.out.println("Hello.  What is your name?");
		name = scan.nextLine();
		
		//use the scanner to input age
		System.out.println("Hi, " + name + "!  How old are you?");
		age = scan.nextInt();
		
		//use the scanner to input salary
		System.out.println("So you're " + age + ", eh?  That's not old at all!");
		System.out.println("How much do you make, " + name + "?");
		salary = scan.nextDouble();
		
		//display salary
		System.out.println(salary +"!  I hope that's per hour and not per year! LOL!");
		
		
		
	}

}
