
//You are on the board
//The walk have to last 10 minutes
//You can go to east, west, north, south
//One move takes 1 minute
//You have to finish your walk in this same place, where You started
//Check if this specific route meets these criteria

public class WalkTest {

	public static void main(String[] args) {

		//char walk[] = {'n','n','w','w','n','e','e','s','s','s'}; //true
		char walk[] = {'n','s','n','s','n','s','n','s','n','s'}; //true
		//char walk[] = {'w','e','w','e','w','e','w','e','w','e','w','e'}; //false
		//char walk[] = {'w'}; //false
		//char walk[] = {'n','n','n','s','n','s','n','s','n','s'}; //false
		TenMinWalk tenMinWalk = new TenMinWalk();
		
		System.out.println("Will you be on time for a meeting? :"+tenMinWalk.isValid(walk));
		
	}
}
