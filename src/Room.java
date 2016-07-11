//creating this abstract class Room

public abstract class Room {
	//private fields
	private String name;
	private String desc;
	
	//super constructors
	public Room(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
