package TSE;

import java.util.Scanner;

public class ThirdScript {public static void main(String[] arg) {

	try {
		int[] numbers = new int[3];
	    numbers[2]=45;
	    System.out.println(numbers[2]);
	    } 
	catch (Exception ex) {System.out.println("...");};

	try {
		int[] numbers = new int[3];
		numbers[4]=45;
		System.out.println(numbers[4]);
		} 
	catch (Exception ex) {System.out.println("Opps!");};
	    	    
	enterPhrase();
	
	System.out.println(2+5);
	
}

private static void enterPhrase() {
	
	String a = "Hello, User!";
	System.out.println("Enter a phrase!");
	Scanner phrase = new Scanner(System.in);
	String ph = phrase.nextLine();
	
	try {
		if (!ph.equals(a)) {System.out.println("That's wrong phrase!"); enterPhrase();}	
		} 
	catch (Exception ex) {} 

}
}