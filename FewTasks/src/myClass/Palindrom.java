package myClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		
//Q #8) Write a Java Program to find whether a string or number is palindrome or not.

		
		Scanner in = new Scanner(System.in);
		System.out.println("Please, give me a integer or string and I will chek if it is a palindrom");
		
		String isPalindrom = in.nextLine();
		in.close();
		
		isPalindrom = isPalindrom.toLowerCase();
		
		//StringBuilder is needed to reverse the string
		StringBuilder reverseWord = new StringBuilder(isPalindrom);
		reverseWord.reverse();
		String takeReverseWord = reverseWord.toString();
		
		//I compare: it is palindrom or not
		if(takeReverseWord.equals(isPalindrom)) {
			System.out.println("Word: " + isPalindrom + " is palindrom" );
		}
		
		else {
			System.out.println("Word: " + isPalindrom + " is NOT palindrom" );

		}
		

		
//Method 2 - only for integer
/*		
		ArrayList<Integer> reverseNumber = new ArrayList<Integer>();
		ArrayList<Integer> correctNumber = new ArrayList<Integer>();

		Scanner in = new Scanner(System.in);
		System.out.println("Please, give me a number and I will check it is a palindrom");
		
		int a = in.nextInt();
		in.close();
		
		//reverse my number
		do {
		
			reverseNumber.add(a%10);
			a = a/10;			

		}while(a != 0); 
		
		
		// I create second number in array to compare objects
		for(int i=0; i<reverseNumber.size(); i++) {
			correctNumber.add(reverseNumber.get(reverseNumber.size() - (1+i)));
		}
		
		
		// I check what I have in array lists
		for(int j=0; j<reverseNumber.size(); j++) {
			System.out.println(reverseNumber.get(j));
		}
		
		System.out.println("\n");
		
		for(int j=0; j<correctNumber.size(); j++) {
			System.out.println(correctNumber.get(j));
		}
		
		
		// I check it is palindrom or not
		
		if(reverseNumber.equals(correctNumber)) {
			System.out.println("The number is palindrom");
		}
		else {
			System.out.println("The number is NOT palindrom");
		}
		
*/		

		
	
		
	}

}
