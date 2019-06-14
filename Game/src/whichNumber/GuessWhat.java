package whichNumber;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessWhat {

	public static void main(String[] args) {
		
		System.out.println("Please give me 2 numbers(integers), it will be the range of the guesswork: \n");
		
		int leftRange, rightRange;
		
		Scanner console = new Scanner(System.in);
		leftRange = console.nextInt();
		rightRange = console.nextInt();
		
		
		int guess;
		Random generate = new Random();
		guess = generate.nextInt(rightRange-leftRange + 1) + leftRange; 
		
		System.out.println("\nThe number was drawn!: \n");
		System.out.println("How many chances You need? \n");
		
		int howMany;
		do {
		console = new Scanner(System.in);
		howMany = console.nextInt();
		
		if(howMany > (rightRange - leftRange)) {
			System.out.println("You can't take more chances that you have possibilities! Try again.");
		}
		
		}while(howMany > (rightRange - leftRange));
		
		System.out.println("\n You have "+ howMany + " chances/e to guess - Start!: \n\n");
		
		int chosen;
		for(int i=0;i<howMany;i++) {
			
			console = new Scanner(System.in);
			chosen = console.nextInt();
			
			if(chosen == guess ) {
				System.out.println("You won! The number is: \n"+ chosen);
				i=howMany;
			}	
			
			else {
				int youHave = howMany - (i+1);
				System.out.println("Sorry. You have: " + youHave + " attempts \n");
				
				if(youHave == 0){
					System.out.println("Maybe You will win next time? ;-)");
				}
			}

		}
	
		
	}
}
