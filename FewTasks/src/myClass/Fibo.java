package myClass;

import java.util.Scanner;

//Q #9) Write a Java Program for Fibonacci series.



public class Fibo {
	
	static int fibo(int n) {
		
		if(n==0) return 0;
		else if(n==1) return 1;
		else return fibo(n-1) + fibo(n-2);
		
	}

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		System.out.println("Please, give me the number");
		int numberToCheck = in.nextInt();
		in.close();
		System.out.println(fibo(numberToCheck));



//Method 2 - without recursion		
/*	
	int a,b, score;
	score = 0;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Please, give me a number: ");
	int number = in.nextInt();
	in.close();
	
	if(number < 2) {
		if(number == 0) {
			score=0;
		}
		else {
			score=1;
		}
	}

	a = 0;
	b=1;
	for(int i=2; i<=number; i++) {
		
		score = a+b;
		a = b;
		b = score;
	}
	
	System.out.println("Score is: " + score);
*/
}
	
}
