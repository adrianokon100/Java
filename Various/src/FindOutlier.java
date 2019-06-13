import java.util.ArrayList;

public class FindOutlier{
	
	
  static int find(int[] integers){
  
	  ArrayList<Integer> odd = new ArrayList<Integer>();
	  ArrayList<Integer> even = new ArrayList<Integer>();

	  for(int i=0;i<integers.length;i++) {
		  
		  if(integers[i]%2==0) {
			  odd.add(integers[i]);
		  }
		  else {
			  even.add(integers[i]);
		  }
		  
	  }
	  
	  if(odd.size()==1) {
		  return odd.get(0);
	  }
	  else {
		  return even.get(0);
	  }
  
  
  }
}