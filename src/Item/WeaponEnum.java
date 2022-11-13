package Item;

public enum WeaponEnum {
	//Name/cost/level/damage/required hands
	Sword("Sword", 500, 1, 800, 1),
	Bow("Bow", 300, 2, 500, 2),
	Scythe("Scythe", 1000, 6, 1100, 2),
	Axe("Axe", 550, 5, 850, 1),
	TSwords("TSwords", 1400, 8, 1600, 2),
	Dagger("Dagger", 200, 1, 250, 1)      
	;
	
	private String name;
	private long cost;
	private int reqLevel;
	private long damage;
	private int reqHands;

	WeaponEnum(String name, long cost, int reqLevel, long damage, int reqHands) {
		this.name = name;
		this.cost = cost;
		this.reqLevel = reqLevel;
		this.damage = damage;
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

	public long getDamage() {
		return damage;
	}

	public int getReqHands() {
		return reqHands;
	}
	
}
