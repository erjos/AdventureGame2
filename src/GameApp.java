
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
		// need to change this to take the users name
		String name = "Ethan";

		// r2 and r3 need to be initialized before r1 is constructed so that the
		// rooms do not come back as null
		ChoiceRoom r1 = null;
		RestartRoom r2 = null;
		ChoiceRoom r3 = null;
		RestartRoom r4 = null;
		ChoiceRoom r5 = null;

		// what if instead of this pattern - I create constructors for all the
		// rooms I want to include in my games in separate classes that have
		// a single static switch method designed to instantiate the object
		// based on an integer - then in the main thread I instantiate the rooms
		// when they're needed?
		r4 = new RestartRoom("run",
				"You start running, terrified! Tears streaming from your eyes you cry out, "
						+ "'I'm too young to die!' \n Suddenly you trip on your shoelaces and fall \n hitting your head, "
						+ "knocking you unconcious and ending your night! Man, you suck!",
				r1);

		r2 = new RestartRoom("leave", "You left! Have fun in the suburbs you loser!", r1);

		r5 = new ChoiceRoom("People Mover",
				"You turn around and look behind you, when you realize that the noise is actually "
						+ "coming from above! \n That's right " + name + ", it's the People Mover!",
				"Do you want to board at the Broadway Station or keep walking? " + "(Board / Walk)", "Board", "Walk",
				r2, r4);

		r3 = new ChoiceRoom("Grand River",
				"Great decision " + name + "! I've got a feeling that you have an intersting night ahead of you... \n "
						+ "Excited with your decision, you start walking down Grand River, not sure where exactly you're headed. \n "
						+ "Suddenly, you hear a mechanical whirring growing louder behind you!",
				"Do you run away or turn to investigate? (Run / Turn) ", "Run", "Turn", r4, r5);

		r1 = new ChoiceRoom("Start",
				"It's a Friday night in Detroit.You've had a long week at work and you're not sure what the night holds.",
				"What do you want to do? (Leave / Stay): ", "Leave", "Stay", r2, r3);

		// this has to happen below the constructor for r1 otherwise the r1 will
		// be null because it was created after
		r2.setRestart(r1);
		r4.setRestart(r1);

		r1.response();
	}
}
