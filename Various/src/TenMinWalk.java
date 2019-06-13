
public class TenMinWalk {

    final int MIN_MAX_WALK = 10;
    final int START_PLACE = 10;
	
  public boolean isValid(char[] walk) {
	  
    //Spacer musi trwa� dok�adnie 10 minut
	  if(walk.length != MIN_MAX_WALK) {
		  return false;
	  }
	  
    //Je�li trwa, to sprawdzam, czy ko�czy si� w tym samym miejscu co zaczyna
	  else {
		  
		  int endRow = START_PLACE;
		  int endColumn = START_PLACE;
		  for(int i=0; i<walk.length; i++) {
			 
			  //Nie za bardzo wiem jak mia�bym zrobi� z tego p�tle, to da�em switch
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
		  
		  //por�wnuj� ko�cowe warto�ci z pocz�tkowymi czy s� taie same -
		  //znaczy, czy wr�ci� do miejsca pocz�tkowego
		  //S�uszna uwaga, niepotrzebne zmienne usun��em
		  if(START_PLACE == endRow && START_PLACE == endColumn) {
			  return true;
		  }
		  else {
			  return false;
		  }		  	  
		  
	  }
  }
}