package Item;

public enum PotionEnum {
	//Name/cost/required level/attribute increase/attribute affected
	Healing_Potion("Healing_Potion", 250, 1, 100, "Health"),
	Strength_Potion("Strength_Potion", 200, 1, 75, "Strength"),
	Magic_Potion("Magic_Potion", 350, 2, 100, "Mana"),
	Luck_Elixir("Luck_Elixir", 500, 4, 65, "Agility"),
	Mermaid_Tears("Mermaid_Tears", 850, 5, 100, "Health/Mana/Strength/Agility"),
	Ambrosia ("Ambrosia", 1000, 8, 150, "Health/Mana/Strength/Dexterity/Defense/Agility");

	private String name;
	private long cost;
	private int reqLevel;
	private long attrIncrease;
	private String attrAffected;
	
	
	PotionEnum(String name, long cost, int reqLevel, long attrIncrease, String attrAffected) {
		this.name = name;
		this.cost = cost;
		this.reqLevel = reqLevel;
		this.attrIncrease = attrIncrease;
		this.attrAffected = attrAffected;
	}


	public String getName() {
		return name;
	}


	public long getCost() {
		return cost;
	}


	public int getReqLevel() {
		return reqLevel;
	}


	public long getAttrIncrease() {
		return attrIncrease;
	}


	public String getAttrAffected() {
		return attrAffected;
	}
	
	
}
