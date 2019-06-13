public class FindOdd {
		
	public static int findIt(int[] a) {

	int odd = 0;
	
	for(int i=0;i<a.length;i++) {
		int count = 0;
		odd = a[i];

		for(int j=0;j<a.length;j++) {
			if(a[j] == odd) {
				count++;				
			}
		}
		
		if(count%2==1) break;
	}
	
	return odd;
  }
}