//Write a program to keep track of a boxers weight on different planets
//It should ask him what his earth weight is, and to enter a number for the planet he wants to fight on. 
//It should then compute his weight on the destination planet

import java.util.*;
public class Space_Boxing {

	
	public static void main(String[] args) {
		
		//initialize variables
		int planet;
		double weight;
		double newWeight = 0;
		
		//initialize scanner
		Scanner ln = new Scanner(System.in);
		
		//get weight from user
		System.out.print("Please enter your current earth weight: ");
		weight = ln.nextDouble();
		
		//display information for planets
		System.out.print("I have information for the following planets: "
				+ "\n\t1. Venus\t2. Mars\t\t3. Jupiter"
				+ "\n\t4. Saturn\t5. Uranus\t6. Neptune\n");
		
		//ask user which planet they are visiting
			System.out.print("Which planet are you visiting?");
			planet = ln.nextInt();
		
		//calculate weight
			if (planet == 1) {
				newWeight = weight * 0.78;
				
			}	
			
			else if (planet == 2) {
				newWeight = weight * 0.39;
			}
			
			else if (planet == 3) {
				newWeight = weight * 2.65;
			}
			
			else if (planet == 4) {
				newWeight = weight * 1.17;
			}
			
			else if (planet == 5) {
				newWeight = weight * 1.05;
			}
			
			else if (planet == 6) {
				newWeight = weight * 1.23;
			}
			else {
				System.out.print("Error, pick a number between 1-6");
			}
			
		
			System.out.print( "Your weight should be " + newWeight + " lbs on that planet." );
			
			ln.close();
	}
	

}
