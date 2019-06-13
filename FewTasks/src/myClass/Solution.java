package myClass;

class Solution {
	
    public static int solution(int a, int b) {
    	
	
		long sum = a*b;
		int count = 0;

		while(sum>0) {
	
			if(sum%2 == 1) {
				count++;
			}
			
			sum = sum/2;

		}				
		
		return count;	
	}
    
        // write your code in Java SE 8
    
	
	
	public static void main(String[] args) {
			
	int a = 100000000;
	int b = 100000000;

	//System.out.println(solution(a,b));
	
	String napis = "abcd karol i wójt. Ale nie wiem";
	System.out.println(napis.indexOf("."));
	System.out.println(napis.indexOf("!"));
	System.out.println(napis.indexOf("?"));

			
		}

	}

