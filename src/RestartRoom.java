import java.util.Scanner;

public class RestartRoom extends Room{
	
	//making this variable static
	private Room restart = null;

	public RestartRoom(String name, String desc, Room restart) {
		//in this case the description tells you how / why you died
		super(name, desc);
		this.restart = restart;
	}
	
	/*public Room response(){
		System.out.println("Would you like to play again? (Y / N) ");
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine();
		Room response = null;
		//need this to return the starting room if the user chooses to restart the game
		if(choice.equalsIgnoreCase("y")){
			response = restart;
		} else if (choice.equalsIgnoreCase("n")){
			System.out.println("Thanks for playing!");
		}
		//returns the room that brings you back to the beginning
		return response;
	}*/

}
