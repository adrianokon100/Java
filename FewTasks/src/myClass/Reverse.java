package myClass;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

//Q #1) Write a Java Program to reverse a string without using String inbuilt function.
		
	/*
	String name = "LevelUp";
		
		
	// Method 1 - with StringBuilder	
		StringBuilder inverseName = new StringBuilder();
		inverseName.append(name);
		inverseName = inverseName.reverse();
		System.out.println("When we inverse this name - We get: "+inverseName);		
	*/	
		
	/*
	//Test - why StringBuilder is better sometimes than String
		
		System.out.println("\n\n");
		String s = "a";
		StringBuilder b = new StringBuilder();
		b.append(s);
		long start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			b.append("a");
			//s = new StringBuilder(s).append("a").toString();
		}
		s = b.toString();
		System.out.println("Time1: "+(System.nanoTime()-start));

	System.out.println("\n\n");
		String s2 = "b";
		long start2 = System.nanoTime();
		for(int k=0; k<10000; k++) {
			s2 = s2+"b";
			//s = new StringBuilder(s).append("a").toString();
		}
		System.out.println("Time2: "+(System.nanoTime()-start2));
	*/

		
		
//Q #2) Write a Java Program to reverse a string without using String inbuilt function reverse().
		
		
	//Method 1 - With toCharArray method
	/*	
	 	String name = "Bolivia";
		char[] inverseNameTable = name.toCharArray();
		
		for(int j=1; j<=inverseNameTable.length; j++) {
			
			System.out.println(inverseNameTable[inverseNameTable.length-j]);
		}	
	*/
		
	//Method 2 - With split method
	/*	
		String str;
		Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        str = in.nextLine();
        
        String[] tableOfStrings = str.split("");
        
		for(int i=tableOfStrings.length-1; i>=0; i--)
		{
			System.out.println(tableOfStrings[i]);
		}
	*/
		
	// Method 3 - With charAt method
		
		String soccerTeam, inverseSoccerTeam = "";
		Scanner in = new Scanner(System.in);
		System.out.println("What is the name of Your favourtie soccer team?");
		soccerTeam = in.nextLine();
		
		int lenghtOfString = soccerTeam.length();
		
		for(int i=lenghtOfString-1; i>=0; i--) {
			
			inverseSoccerTeam = inverseSoccerTeam + soccerTeam.charAt(i);
			
		}
		System.out.println(inverseSoccerTeam);
	}
	

}
