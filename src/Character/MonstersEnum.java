package Character;

public enum MonstersEnum {
//	Name/level/damage/defense/dodge chance
	Desghidorrah("Desghidorrah", 3, 300, 300, 400, 35, "Dragon"),
	Chrysophylax("Chrysophylax", 2, 200, 200, 500, 20, "Dragon"),
	BunsenBurner("BunsenBurner", 4, 400, 400, 500, 45, "Dragon"),
	Natsunomeryu("Natsunomeryu", 1, 100, 100, 200, 10, "Dragon"),
	TheScaleless("TheScaleless", 7, 700, 700, 600, 75, "Dragon"),
	Kas_Ethelinh("Kas_Ethelinh", 5, 500, 600, 500, 60, "Dragon"),
	Alexstraszan("Alexstraszan", 10, 1000, 1000, 9000, 55, "Dragon"),
	Phaarthurnax("Phaarthurnax", 6, 600, 600, 700, 60, "Dragon"),
	D_Maleficent("D_Maleficent", 9, 900, 900, 950, 85, "Dragon"),
	TheWeatherbe("TheWeatherbe", 8, 800, 800, 900, 80, "Dragon"),
	Igneel("Igneel", 6, 600, 600, 400, 60, "Dragon"),
	BlueEyesWhite("BlueEyesWhite", 9, 900, 900, 600, 75, "Dragon"),
	Cyrrollalee("Cyrrollalee", 7, 700, 700, 800, 75, "Exoskeleton"),
	Brandobaris("Brandobaris", 3, 300, 350, 450, 30, "Exoskeleton"),
	BigBad_Wolf("BigBad_Wolf", 1, 100, 150, 250, 15, "Exoskeleton"),
	WickedWitch("WickedWitch", 2, 200, 250, 350, 25, "Exoskeleton"),
	Aasterinian("Aasterinian", 4, 400, 400, 500, 45, "Exoskeleton"),
	Chronepsish("Chronepsish", 6, 600, 650, 750, 60, "Exoskeleton"),
	Kiaransalee("Kiaransalee", 8, 800, 850, 950, 85, "Exoskeleton"),
	St_Shargaas("St_Shargaas", 5, 500, 550, 650, 55, "Exoskeleton"),
	Merrshaullk("Merrshaullk", 10, 1000, 1000, 900, 55, "Exoskeleton"),
	St_Yeenoghu("St_Yeenoghu", 9, 900, 950, 850, 90, "Exoskeleton"),
	DocOck("DocOck", 6, 600, 600, 600, 55, "Exoskeleton"),
	Exodia("Exodia", 10, 1000, 1000, 1000, 50, "Exoskeleton"),
	Andrealphus("Andrealphus", 2, 200, 600, 500, 40, "Exoskeleton"),
	Blinky("Blinky", 1, 100, 450, 350, 35, "Exoskeleton"),
	Andromalius("Andromalius", 3, 300, 550, 450, 25, "Exoskeleton"),
	Chiang_shih("Chiang_shih", 4, 400, 700, 600, 40, "Exoskeleton"),
	FallenAngel("FallenAngel", 5, 500, 800, 700, 50, "Exoskeleton"),
	Ereshkigall("Ereshkigall", 6, 600, 950, 450, 35, "Exoskeleton"),
	Melchiresas("Melchiresas", 7, 700, 350, 150, 75, "Exoskeleton"),
	Jormunngand("Jormunngand", 8, 800, 600, 900, 20, "Exoskeleton"),
	Rakkshasass("Rakkshasass", 9, 900, 550, 600, 35, "Exoskeleton"),
	Taltecuhtli("Taltecuhtli", 10, 1000, 300, 200, 50, "Exoskeleton"),
	Casper("Casper", 1, 100, 100, 100, 50, "Exoskeleton");


	private String Name;
	private int level;
	private long HP;
	private long damage;
	private long defense;
	private long dodgeChance;
	private String category;
	
	MonstersEnum(String name, int level, long HP, long damage, long defense, long dodgeChance, String category) {
		this.Name = name;
		this.level = level;
		this.HP = HP;
		this.damage = damage;
		this.defense = defense;
		this.dodgeChance = dodgeChance;
		this.category = category;
	}
	
	public String getName() {
		return Name;
	}

	public int getLevel() {
		return level;
	}

	public long getHP() {
		return HP;
	}

	public long getDamage() {
		return damage;
	}

	public long getDefense() {
		return defense;
	}

	public long getDodgeChance() {
		return dodgeChance;
	}

	public String getCategory() {
		return category;
	}
	
}
