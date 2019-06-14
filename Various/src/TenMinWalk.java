
public class TenMinWalk {

    final int MIN_MAX_WALK = 10;
    final int START_PLACE = 10;
	
  public boolean isValid(char[] walk) {
	  
    //The walk have to takes 10 minutes
	  if(walk.length != MIN_MAX_WALK) {
		  return false;
	  }
	  
    //If takes 10 minutes, check if will finish in this same place where he started
	  else {
		  
		  int endRow = START_PLACE;
		  int endColumn = START_PLACE;
		  for(int i=0; i<walk.length; i++) {
			 
			  switch(walk[i]) {
			  
			  case 'n':
				  endRow = endRow + 1; 
				  break;
			  case 's':
				  endRow = endRow - 1;
				  break;
			  case 'w':
				  endColumn = endColumn + 1;
				  break;
			  case 'e':
				  endColumn = endColumn - 1;
				  break;

			  }
			  
		  }
		  
		  //compare finish values with init values - if are the same is good
		  //znaczy, czy wrócił do miejsca początkowego
		  if(START_PLACE == endRow && START_PLACE == endColumn) {
			  return true;
		  }
		  else {
			  return false;
		  }		  	  
		  
	  }
  }
}
