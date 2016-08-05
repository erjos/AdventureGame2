
public class GameApp {
	public static void main(String[] args) {

		// potential solution to this problem. Still list them as generic r1 and
		// r2 and create as many rooms as you need for the longest
		// possible path in the game
		// then have the constructors for all of the rooms in a separate class
		// (like the MovieIO) file - keep in a switch statement with an index
		// then the logic in the main refers to the room as an index and calls
		// the method according to the rooms options in the previous statement

		// declaring some Room variables that I can instantiate as different
		// types of Rooms later on
		String name = null;
		ChoiceRoom r1 = null;
		RestartRoom r2 = null;
		ChoiceRoom r3 = null;

		//r2 and r3 need to be initialized before r1 is constructed so that the rooms do not come back as null
		r2 = new RestartRoom("Restart 1", "You left! Have fun in the suburbs you loser!", r1);
		r3 = new ChoiceRoom("Grand River", "Great decision " + name
				+ "! I've got a feeling that you have an intersting night ahead of you... \n "
				+ "Excited with your decision, you start walking down Grand River, not sure where exactly you're headed. \n "
				+ "Suddenly, you hear a mechanical whirring growing louder behind you!", "Do you run away or turn to investigate? (Run / Turn) ","Run","Turn", r2, r3);
		
		r1 = new ChoiceRoom("Start",
				"It's a Friday night in Detroit.You've had a long week at work and you're not sure what the night holds.",
				"What do you want to do? (Leave / Stay): ", "Leave", "Stay", r2, r3);

		// setting the Restart ChoiceRoom for r2 - RestartRoom constructor
		// requires a ChoiceRoom as a parameter
		r2.setRestart(r1);

		r1.response();
	}
}
