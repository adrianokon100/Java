
public class WalkTest {

	public static void main(String[] args) {

		//char walk[] = {'n','n','w','w','n','e','e','s','s','s'}; //true
		char walk[] = {'n','s','n','s','n','s','n','s','n','s'}; //true
		//char walk[] = {'w','e','w','e','w','e','w','e','w','e','w','e'}; //false
		//char walk[] = {'w'}; //false
		//char walk[] = {'n','n','n','s','n','s','n','s','n','s'}; //false
		TenMinWalk tenMinWalk = new TenMinWalk();
		
		System.out.println("Czy zd¹¿y na spotkanie? :"+tenMinWalk.isValid(walk));
		
	}
}
