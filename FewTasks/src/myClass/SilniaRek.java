package myClass;

public class SilniaRek {

	
	public static int silnia(int n) {

		if(n<2) { return 1; }
		
		return n*silnia(n-1);
				
	}
	
	public static void main(String[] args) {

		int giveMe = 5;
		
		System.out.println(silnia(giveMe));
		
		
		
		
	}

}
