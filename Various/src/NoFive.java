import java.util.ArrayList;

public class NoFive {
	
	public static int dontGiveMeFive(int start, int end)  {
		
		int count = 0;
		for(int i=start; i<=end; i++) {
			
			if(String.valueOf(i).indexOf("5") == -1) {
				System.out.println("Liczba to: "+i);
				count++;
			}
		
			
		}
		
	    return count;
	}
}


