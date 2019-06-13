package myClass;

class Solution2 {
	
   static public int solution(String S) {
	   S = S.trim();

	   if(S.isEmpty()) return 0;
	   
	   int help, help2, help3, help4, help5, j, max, sum;
	   help4 = help5 = j = sum = max = 0;

	   for(int i=help4; i<S.length(); i++) {
		   	   
		   if(max > sum) {
			   sum = max;
		   }
		   
		   help = S.indexOf(".");
		   System.out.println("help to: "+help);
		   help2 = S.indexOf("!");
		   System.out.println("hel2p to: "+help2);

		   help3 = S.indexOf("?");
		   System.out.println("help3 to: "+help3);

		   if(help < help2 && help > -1) {help4 = help;}
		   if(help2 <  help && help2 > -1) {help4 = help;}
		   
		   
		   if(help4 > help3 && help3 >-1 ) { help4 = help3;}	
		   System.out.println("help4 to: "+help4);

		   

		   String Ss = S.substring(help5, help4);
		   S = S.substring(help4+1);
		   for(int p=help5; p<help4; p++) {
			   
			   System.out.println("3sum jest równe: "+sum);
	   
		   	   
			   
			   if(S.charAt(j) != ' ') {
				   j++;
			   }
			   
			   if(S.charAt(j) == ' ') {
				   max++;
				   
				   while(S.charAt(j+1) == ' ') {
					   j++;
					   p++;
				   }

				   
			   }
			   
			   
		   }
	   }
	   
	   return sum;
    }
    
	
	
	public static void main(String[] args) {


	//System.out.println(solution("abcd kop"));
	String S = "cebula cebula.";
	System.out.println(solution(S));
		}

	}

