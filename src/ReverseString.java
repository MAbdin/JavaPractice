import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String str = "";
		String reverse = "";
		
		System.out.print("Enter a string to reverse: ");
		str = input.nextLine();
		
		for(int i = str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reversed array: " + reverse);
	

		if(reverse.equals(str)) {
			System.out.println("Is anagram!");
			
	}
		else 
			System.out.println("Not an anagram!");

}
}
