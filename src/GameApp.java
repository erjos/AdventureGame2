
public class GameApp {
	public static void main(String[] args) {
		
		//potential solution to this problem. Still list them as generic r1 and r2 and create as many rooms as you need for the longest
		//possible path in the game
		//then have the constructors for all of the rooms in a separate class (like the MovieIO) file - keep in a switch statement with an index
		// then the logic in the main refers to the room as an index and calls the method according to the rooms options in the previous statement
		
		
		//declaring some Room variables that I can instantiate as different types of Rooms later on
		Room r1 = null;
		Room r2 = null;
		Room r3 = null;
				
		//Instantiating this first room as a ChoiceRoom which will return either r2 or r3 depending on the users choice
		r2 = new RestartRoom("Restart", "You left! Have fun in the suburbs you loser!", r1);
		
		r1 = new ChoiceRoom("Start", "It's a Friday night in Detroit.You've had a long week at work and you're not sure what the night holds.", 
				"What do you want to do? (Leave / Stay): ", "Leave", "Stay", r2, r3);
		
		r1.response();
	}
}
