package Character;

import LevelUp.LevelUpBehaviour;

public enum HeroesEnum {
	Amaryllis_Astra("Amaryllis_Astra", 1, 100, 500, 500, 500, 500, 2500, 5, "Paladin"),
	Caliber_Heist("Caliber_Heist", 1, 100, 400, 400, 400, 400, 2500, 8, "Paladin"),
	Garl_Glittergold("Garl_Glittergold", 1, 100, 100, 600, 400, 500, 2500, 5, "Paladin"),
	Parzival("Parzival", 1, 100, 300, 750, 700, 650, 2500, 7, "Paladin"),
	Sehanine_Moonbow("Sehanine_Moonbow", 1, 100, 300, 750, 700, 700, 2500, 7, "Paladin"),
	Skoraeus_Stonebones("Skoraeus_Stonebones", 1, 100, 250, 650, 350, 600, 2500, 4, "Paladin"),
	Kalabar("Kalabar", 1, 100, 800, 850, 600, 400, 2500, 6, "Sorcerer"),
	Rillifane_Rallathil("Rillifane_Rallathil", 1, 100, 1300, 750, 500, 450, 2500, 9, "Sorcerer"),
	Segojan_Earthcaller("Segojan_Earthcaller", 1, 100, 900, 800, 650, 500, 2500, 5, "Sorcerer"),
	Reign_Havoc("Reign_Havoc", 1, 100, 800, 800, 800, 800, 2500, 8, "Sorcerer"),
	Reverie_Ashels("Reverie_Ashels", 1, 100, 900, 800, 400, 700, 2500, 7, "Sorcerer"),
	Skye_Soar("Skye_Soar", 1, 100, 1000, 700, 500, 400, 2500, 5, "Sorcerer"),
	Gaerdal_Ironhand("Gaerdal_Ironhand", 1, 100, 100, 700, 600, 500, 1354, 7, "Warrior"),
	Sehanine_Monnbow("Sehanine_Monnbow", 1, 100, 600, 700, 500, 800, 2500, 8, "Warrior"),
	Muamman_Duathall("Muamman_Duathall", 1, 100, 300, 900, 750, 500, 2546, 6, "Warrior"),
	Flandal_Steelskin("Flandal_Steelskin", 1, 100, 200, 750, 700, 650, 2500, 7, "Warrior"),
	Undefeated_Yoj("Undefeated_Yoj", 1, 100, 400, 800, 700, 400, 2500, 7, "Warrior"),
	Eunoia_Cyn("Eunoia_Cyn", 1, 100, 400, 700, 600, 800, 2500, 6, "Warrior");
	
	
	private String Name;
	private int level;
	private long HP;
	private double MP;
	private long strength;
	private long dexterity;
	private long agility;
	private long gold;
	private int experience;
	private String category;
	
	
	HeroesEnum(String name, int level, long HP, double MP, long strength, long dexterity, long agility, long gold, int experience, String category) {
		this.Name = name;
		this.level = level;
		this.HP = HP;
		this.MP = MP;
		this.strength = strength;
		this.dexterity = dexterity;
		this.agility = agility;
		this.gold = gold;
		this.experience = experience;
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


	public double getMP() {
		return MP;
	}


	public long getStrength() {
		return strength;
	}


	public long getDexterity() {
		return dexterity;
	}


	public long getAgility() {
		return agility;
	}


	public long getGold() {
		return gold;
	}


	public int getExperience() {
		return experience;
	}



	public String getCategory() {
		return category;
	}


	

	
	
}
