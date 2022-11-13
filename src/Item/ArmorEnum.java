package Item;

public enum ArmorEnum {
	Platinum_Shield("Platinum_Shield", 150, 1, 200),
	Breastplate("Breastplate", 350, 3, 600),
	Full_Body_Armor("Full_Body_Armor", 1000, 8, 1100),
	Wizard_Shield("Wizard_Shield", 1200, 10, 1500),
	Guardian_Angel("Guardian_Angel", 1000, 10, 1000)
	;

	private String name;
	private long cost;
	private int reqLevel;
	private long damageRed;
	
	ArmorEnum(String name, long cost, int reqLevel, long damageRed) {
		this.name = name;
		this.cost = cost;
		this.reqLevel = reqLevel;
		this.damageRed = damageRed;
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

	public long getDamageRed() {
		return damageRed;
	}
	
	

}
	
	