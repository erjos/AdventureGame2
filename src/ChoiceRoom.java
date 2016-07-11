import java.util.Scanner;

public class ChoiceRoom extends Room {
	//couple of fields unique to the ChoiceRoom
	private String question;
	private String choice1;
	private String choice2;
	
	//these are two adjacent rooms that the user has the choice to enter from the current room
	private Room path1;
	private Room path2;
	
	
	//subclass constructor that calls the super constructor
	public ChoiceRoom(String name, String desc, String question, String ch1, String ch2, Room p1, Room p2) {
		//super constructor
		super(name, desc);
		this.question = question;
		choice1 = ch1;
		choice2 = ch2;
		path1 = p1;
		path2 = p2;
	}
	
	//This method will create and direct the user to the next room based on the choice that they select
	public Room response(){
		System.out.println(getDesc());
		System.out.println(question);
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine();
		Room response = null;
		if (choice.equals(choice1))
			response = path1;
		 else if (choice.equals(choice2))
			response = path2;
		return response;
	}
}