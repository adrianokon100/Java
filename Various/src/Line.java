public class Line {
		
  public String Tickets(int[] peopleInLine) {

	  int bill25 = 0;
	  int bill50 = 0;
	  for(int i : peopleInLine) {
		  System.out.println("i jest równe: " +i);
		  switch(i) {
		  	case 25:
			  bill25++;
			  break;
			  
		  	case 50:
		  	  bill25--;
		  	  bill50++;
			  break;
			  
		  	case 100:
		  		if(bill50 > 0) {
		  			bill50--;
		  			bill25--;
		  			break;
		  		}
		  		else {
		  			bill25-=3;
		  			break;	
		  		}
		  		
		  }
		  
		  if(bill25 <0) {
			  return "NO";
		  }
		  
	  }
	  
	 if(bill25 < 0 ) {
		 return "NO";
	 }
		 
	return "YES";	
	  
  }
}