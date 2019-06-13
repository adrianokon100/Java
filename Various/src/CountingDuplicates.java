/*import java.util.ArrayList;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
	  
	  text = text.toLowerCase();
	  char[] takeSigns = text.toCharArray();
	  
	  ArrayList<Character> itWas = new ArrayList<Character>(); 
	  String subString; 	  
	  int count = 0;
	  
	  for(int i=0; i<text.length(); i++) {
		  
		  subString = text.substring(i+1);		  
		  if(subString.contains(String.valueOf(takeSigns[i]))  &&
				  !itWas.contains(takeSigns[i])){
			  
			  itWas.add(takeSigns[i]);
			  count++;
			  
		  }    
	  }
	  
	  return count;
  }
}
*/

//Inny sposób na rozwi¹zanie



import java.util.ArrayList;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
  
	  String subStringOneSign;
	  text = text.toLowerCase();
	  int count = 0;
	  
	  while(text.length() > 0) {
		  
		  subStringOneSign = String.valueOf(text.charAt(0));
		  text = text.substring(1);
		  
		  if(text.contains(subStringOneSign)) {
  			  count++;
  			  text = text.replace(subStringOneSign, "");
		  }    	  
	  }
	  return count;
  }
}

