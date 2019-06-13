package myClass;

import java.util.Scanner;

public class PrimeNumber {
	
public static void main(String[] args) {



//Q #7) Write a Java Program to find whether a number is prime or not.

	Scanner in = new Scanner(System.in);
	System.out.println("Please, give me integer");
	int givenNumber = in.nextInt();
	in.close();
	System.out.println("The number is: " + givenNumber);
	
	int helper = 2;
	double check = Math.sqrt(givenNumber);
	int divide = helper;
	boolean primeNumber = true;
	
	if(givenNumber < 2) {
		primeNumber = false;
	}
	else {
		while(divide <= check ) {
			if(givenNumber % divide == 0) {
				primeNumber = false;
				divide = givenNumber;
			}
			
			else {
				divide++;
			}
			
		}
	}
	
	
	if(primeNumber) {
		System.out.println("The number: " + givenNumber + " is prime number");
	}
	else {
		System.out.println("The number: " + givenNumber + " is NOT prime number");
	}
	
// dzieliæ od 1 do pierwiastek kwadratowy z liczby	
// reszta z dzielenia != 0	
	
	
}
}
