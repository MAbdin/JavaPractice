/*
A simple calculator to determine body mass index
It is computed by taking the individual's weight (mass) 
in kilograms and dividing it by the square of their height in meters.
*/

import java.util.*;
public class BMI_Calculator {

	public static void main(String[] args) {
		
		//initialize variables
		double height;
		double weight;
		double bmi;
		double m;
		double kg;
		
		//initialize scanner
		Scanner scan = new Scanner(System.in);

		//get height and weight from user
		System.out.print("Your height in inches: ");
		height = scan.nextDouble();
		
		System.out.print("Your weight in pounds: ");
		weight = scan.nextDouble();
		
		//convert inches and pounds to meters and kg
		m = height * .0254;
		kg = weight * .4535;
		
		//calculate BMI
		bmi = (kg / Math.pow(m, 2));
		
		//display BMI
		System.out.print("Your BMI is "+bmi);
	}
	
	//BMI categories without using IF statements
	
	

}
