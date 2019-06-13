
public class TenMinWalk {

    final int MIN_MAX_WALK = 10;
    final int START_PLACE = 10;
	
  public boolean isValid(char[] walk) {
	  
    //Spacer musi trwaæ dok³adnie 10 minut
	  if(walk.length != MIN_MAX_WALK) {
		  return false;
	  }
	  
    //Jeœli trwa, to sprawdzam, czy koñczy siê w tym samym miejscu co zaczyna
	  else {
		  
		  int endRow = START_PLACE;
		  int endColumn = START_PLACE;
		  for(int i=0; i<walk.length; i++) {
			 
			  //Nie za bardzo wiem jak mia³bym zrobiæ z tego pêtle, to da³em switch
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
		  
		  //porównujê koñcowe wartoœci z pocz¹tkowymi czy s¹ taie same -
		  //znaczy, czy wróci³ do miejsca pocz¹tkowego
		  //S³uszna uwaga, niepotrzebne zmienne usun¹³em
		  if(START_PLACE == endRow && START_PLACE == endColumn) {
			  return true;
		  }
		  else {
			  return false;
		  }		  	  
		  
	  }
  }
}