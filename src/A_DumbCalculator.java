//This is a simple numeric calculator.  
//It should prompt the user for three numbers.
//Then add the numbers together and divide by 2.

import java.util.*;
public class A_DumbCalculator {

	public static void main(String[] args) {
		
		//initialize variables
		double firstNum;
		double secondNum;
		double thirdNum;
		double sum;
		int divisor = 2;
		
		//initialize scanner
		Scanner scan = new Scanner(System.in);

		//get values for your numbers from user
		System.out.print("What is your first number? ");
		firstNum = scan.nextDouble();
		
		System.out.print("What is your second number? ");
		secondNum = scan.nextDouble();
		
		System.out.print("What is your third number? ");
		thirdNum = scan.nextDouble();
		
		//add up the three numbers and divide by 2
		sum = (firstNum + secondNum + thirdNum) / divisor;
		
		//display the values
		System.out.print("( "+firstNum+" + "+secondNum+" + "+thirdNum+" ) / "+divisor+" is... "+sum);
		
	}

}
