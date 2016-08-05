import java.util.Scanner;

public class ChoiceRoom extends Room {
	// couple of fields unique to the ChoiceRoom
	private String question;
	private String choice1;
	private String choice2;
	
	// these are two adjacent rooms that the user has the choice to enter from
	// the current room
	private Room path1;
	private Room path2;

	// subclass constructor that calls the super constructor
	public ChoiceRoom(String name, String desc, String question, String ch1, String ch2, Room p1, Room p2) {
		// super constructor
		super(name, desc);
		this.question = question;
		choice1 = ch1;
		choice2 = ch2;
		path1 = p1;
		path2 = p2;

	}

	// This method will create and direct the user to the next room based on the
	// choice that they select
	public void response() {
		String resp = null;
		// first it prints the description of the room you created
		System.out.println(getDesc());

		// Then it prints the question
		System.out.println(question);
		Scanner input = new Scanner(System.in);
		//takes the response and sets it according to user input
		resp = input.nextLine();
		
		Room nextRoom = null;
		
		//compares the response to the choices of the user and returns the appropriate room
		if(resp.equalsIgnoreCase(choice1)){
			nextRoom = path1;
			nextRoom.response();
		}else if (resp.equalsIgnoreCase(choice2)){
			nextRoom = path2;
			nextRoom.response();
		}
	}

}
