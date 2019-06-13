package myClass;

public class SecondHighestNumber {

	public static void main(String[] args) {

		
//Q #16) Write a Java Program to find the second highest number in an array.


	int table[] = new int[] {10, 300, 20, 100, 50, 50, 4335, 30, 95, 0, 1};
	int largest, secondLargest;
	largest = secondLargest = 0;
	
	
	for(int i=0; i<table.length; i++) {
		
			if(table[i] > largest) {
				secondLargest = largest;
				largest = table[i];
			}
			
			else if (table[i] > secondLargest && table[i] != largest) {
				secondLargest = table[i];
			}
	}
		
	
	
	System.out.println("The bigest is: " + largest);
	System.out.println("The second one is: " + secondLargest);
	
	}

}
