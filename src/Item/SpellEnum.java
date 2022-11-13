package Item;

public enum SpellEnum {
	Snow_Cannon("Snow_Cannon", 500, 2, 650, 250, "Ice Spell"),
	Ice_Blade("Ice_Blade", 250, 1, 450, 100, "Ice Spell"),
	Frost_Blizzard("Frost_Blizzard", 750, 5, 850, 350, "Ice Spell"),
	Arctic_Storm("Arctic_Storm", 700, 6, 800, 300, "Ice Spell"),
	Flame_Tornado("Flame_Tornado", 700, 4, 850, 300, "Fire Spell"),
	Breath_of_Fire("Breath_of_Fire", 350, 1, 450, 100, "Fire Spell"),
	Heat_Wave("Heat_Wave", 450, 2, 600, 150, "Fire Spell"),
	Lava_Comet("Lava_Comet", 800, 7, 1000, 550, "Fire Spell"),
	Hell_Storm("Hell_Storm", 600, 3, 950, 600, "Fire Spell"),
	Lightning_Dagger("Lightning_Dagger", 400, 1, 500, 150, "Lightning Spell"),
	Thunder_Blast("Thunder_Blast", 750, 4, 950, 400, "Lightning Spell"),
	Electric_Arrows("Electric_Arrows", 550, 5, 650, 200, "Lightning Spell"),
	Spark_Needles("Spark_Needles", 500, 2, 600, 200, "Lightning Spell");
	
	
	private String name;
	private long cost;
	private int reqLevel;
	private long damage;
	private long manaCost;
	private String spellType;

	SpellEnum(String name, long cost, int reqLevel, long damage, long manaCost, String spellType) {
		this.name = name;
		this.cost = cost;
		this.reqLevel = reqLevel;
		this.damage = damage;
		this.manaCost = manaCost;
		this.spellType = spellType;
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

	public long getManaCost() {
		return manaCost;
	}

	public String getSpellType() {
		return spellType;
	}

}
