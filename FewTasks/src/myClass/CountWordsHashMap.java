package myClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountWordsHashMap {

	public static void main(String[] args) {

//Q #5) Write a Java Program to count the number of words in a string using HashMap.
	
/*		
		
	String countWords = "You can do it, just You need more practice";
	HashMap<String, Integer> myMap = new HashMap<String, Integer>();
	
	String[] listOfWords = countWords.split(" ");
	
	for(int i=0; i<listOfWords.length; i++) {
		if(myMap.containsKey(listOfWords[i])) {
			int count = myMap.get(listOfWords[i]);
			myMap.put(listOfWords[i], count+1);
		}
		else {
			
			myMap.put(listOfWords[i], 1);
			
		}
		
	}
	
	System.out.println(myMap);
*/
		
		
//Q #6) Write a Java Program to iterate HashMap using While and advance for loop.


	HashMap<Integer, String> myMap = new HashMap<Integer, String>();
	myMap.put(2, "Salah");
	myMap.put(25, "Firmino");
	myMap.put(12, "Mane");
	
	
	System.out.println(myMap.size());
	System.out.println("While loop");
	
	
	Iterator itr = myMap.entrySet().iterator();

	while(itr.hasNext()) {
        Map.Entry me = (Map.Entry) itr.next();
		System.out.println("The key is: " + me.getKey()+ " And the value is: " + me.getValue());
	}
	
	
	System.out.println("For loop:");
	for(Map.Entry me2: myMap.entrySet()) {
		System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
		
	}
	
	
// Different task with map	
/*		
	Map<Integer, String> myMap = new HashMap<Integer, String>();
	myMap.put(0, "Asia");
	myMap.put(1, "Karol");
	myMap.put(4, "Justyna");
	int checkIsFinish = 0;
	int countMap = 0;

	String[] tableOfNames = {"Irek", "Luiza", "Julia"};
	
	
	while (checkIsFinish < tableOfNames.length) {

		if(myMap.containsKey(countMap)) {
			countMap++;

		}
		else {
			myMap.put(countMap, tableOfNames[checkIsFinish]);
			checkIsFinish++;
			countMap++;

		}
	}
	

	for(int i=0; i<myMap.size(); i++) {
		System.out.println(myMap.get(i));
	}


*/
}
			
	
}


