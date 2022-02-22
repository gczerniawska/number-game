package numGame;

import java.util.Scanner;

public class Scan {
	
	 public static void main(String[] args) {
	        Scanner myObj = new Scanner(System.in);
	        System.out.println("Enter a number: ");

	        int number = myObj.nextInt();
	        System.out.println("User number is " + number);

	 }

}
