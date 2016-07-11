
public class GameApp {
	public static void main(String[] args) {
		
		//declaring some Room variables that I can instantiate as different types of Rooms later on
		Room r1 = null;
		Room r2 = null;
		Room r3 = null;
				
		//Instantiating this first room as a ChoiceRoom which will return either r2 or r3 depending on the users choice
		r1 = new ChoiceRoom("Start", "It's a Friday night in Detroit.You've had a long week at work and you're not sure what the night holds.", 
				"What do you want to do? (Leave / Stay): ", "Leave", "Stay", r2, r3);
		
		//need to cast r1 as a ChoiceRoom in order to call  the response() method
		r1 = ((ChoiceRoom)r1).response();
		
		
	}

}
