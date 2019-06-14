package myClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateCharacters {

	public static void main(String[] args) {

//Q #15) Write a Java Program to find the duplicate characters in a string. 

				
	

// Method 1
		
		String name = "Amazingzggas";
		name = name.toLowerCase();
		
		char[] takeStringToChar = name.toCharArray();	
		Set<Character> takeDuplicateElements = new HashSet<Character>();

		char takeChar;
		String takeSubstring;
		String helper = "";
		
		for(int i=0; i<name.length(); i++) {
			
			takeChar = name.charAt(i);
			takeSubstring = name.substring(i+1);
			
			if(takeSubstring.contains(helper.valueOf(takeChar)) && !(takeDuplicateElements.contains(takeStringToChar[i]))) {

				takeDuplicateElements.add(takeStringToChar[i]);
			
			}
			
			
		}
		
		System.out.println("Duplicate elements: " + takeDuplicateElements);
	


//Method 2		
/*
			
		String name = "Amazingzgg";
		name = name.toLowerCase();
		
		char[] takeStringToChar = name.toCharArray();

		List<Character> takeStringToCharUnique = new ArrayList<Character>();
		Set<Character> takeDuplicateElements = new HashSet<Character>();
		
		for(int i=0; i<takeStringToChar.length; i++) {
						
			if(takeStringToCharUnique.contains(takeStringToChar[i])
					&& !(takeDuplicateElements.contains(takeStringToChar[i]))) {
				
				takeDuplicateElements.add(takeStringToChar[i]);
			}
			
			takeStringToCharUnique.add(takeStringToChar[i]);			
			
		}
		
		System.out.println("Duplicate elements: " + takeDuplicateElements);
*/		
		
//Method 3 - Only if You have max 2 these same elements like "ammz" no "ammmz"		

		
/*		
		String str = new String("Sakkett");
		char[] chars = str.toCharArray();
				                  
		System.out.println("Duplicate characters are:");
				                  
		for (int i=0; i<str.length();i++) {
			for(int j=i+1; j<str.length();j++) {
			
				if (chars[i] == chars[j]) {
					System.out.println(chars[j]);
				    break;
				}
	 		}
 		}		
*/		

		
// Method 4		
/*		
		String name = "Live is beautiful";
		Set<Character> takeCharSet= new LinkedHashSet<Character>();
		for(int i=0; i<name.length(); i++) {

			takeCharSet.add(name.charAt(i));
		}
		
	
		Map<Character, Integer> countHashMap = new HashMap<>();
		int howManyTimes=1;
		for(int i=0; i<name.length(); i++) {
			
			if(countHashMap.containsKey(name.charAt(i))){
				howManyTimes = countHashMap.get(name.charAt(i));
				countHashMap.put(name.charAt(i), howManyTimes+1);
			}
			else {
				countHashMap.put(name.charAt(i), howManyTimes);

			}
			
		}
		
		System.out.println(countHashMap);
		char takeChar;
			System.out.println("Size of takeCharSet: " + takeCharSet.size());

			Iterator<Character> itr = takeCharSet.iterator();
			
			while(itr.hasNext()) {
				takeChar = itr.next();
					
				if(countHashMap.get(takeChar) > 1) {

					System.out.println("Duplicate variable: " + takeChar);	
					
				}
					
			}
				
*/}

}
