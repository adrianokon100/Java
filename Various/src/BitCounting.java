import java.util.ArrayList;

public class BitCounting {

	public static int countBits(int n){
		
		ArrayList<Integer> myNumberBinary = new ArrayList<Integer>();
		
		while(n>0) {
			myNumberBinary.add(n%2);
			n = n/2;	
		}	
		
		int count = 0;
		for(int j=0;j<myNumberBinary.size();j++) {
			if(myNumberBinary.get(j)==1) {
				count++;
			}
		}		

		return count;
    
    
	}
	
}