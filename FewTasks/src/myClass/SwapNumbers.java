package myClass;

public class SwapNumbers {

	public static void main(String[] args) {

//Q #4) Write a Java Program to swap two numbers without using the third variable.

		int a = 30;
		int b = 50;

		System.out.println("Before Swapping\nx: " + a + "\ny=: " + b);

		a = a + b; // a = 30 + 50 = 80
		b = a - b; // b = 80 - 50 = 30
		a = a - b; // a = 80 - 30 = 50

		System.out.println("\n\nAfter Swapping\nx: " + a + "\ny=: " + b);

	}

}
