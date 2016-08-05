import java.util.Scanner;

public class RestartRoom extends Room{
	
	//making this variable static
	private ChoiceRoom restart = null;

	public RestartRoom(String name, String desc, ChoiceRoom restart) {
		//in this case the description tells you how / why you died
		super(name, desc);
		this.restart = restart;
	}
	
	public void response(){
		System.out.println(getDesc());
		System.out.println("Would you like to play again? (Y / N) ");
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine();
		//need this to return the starting room if the user chooses to restart the game
		if(choice.equalsIgnoreCase("y")){
			restart.response();
		} else if (choice.equalsIgnoreCase("n")){
			System.out.println("Thanks for playing!");
		}
	}

	public  ChoiceRoom getRestart() {
		return restart;
	}

	public void setRestart(ChoiceRoom restart) {
		this.restart = restart;
	}

}
