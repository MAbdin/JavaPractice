import java.util.*;
public class studentInfo {

	public static void main(String[] args) {
		
		//initialize variables
		String firstName;
		String lastName;
		int grade;
		int studentID;
		String login;
		double gpa;
		
		//initialize scanner
		Scanner scan = new Scanner(System.in);
		
		//ask the user for data and input using scanner
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		
		//use scanner to get user input
		System.out.print("First name: ");
		firstName = scan.nextLine();
		
		System.out.print("Last name: ");
		lastName = scan.nextLine();
		
		System.out.print("Grade (9-12): ");
		grade = scan.nextInt();
		
		System.out.print("Student ID: ");
		studentID = scan.nextInt();
		
		System.out.print("Login: ");
		login = scan.next();
		
		System.out.print("GPA: ");
		gpa = scan.nextDouble();
		
		//print student info
		System.out.println("Your information:\n\tLogin:\t" 
		+ login +"\n\tID:\t" + studentID + "\n\tName\t"
				+ lastName + ", " + firstName + "\n\tGPA:\t" + gpa +
				"\n\tGrade:\t" + grade);

	}

}
