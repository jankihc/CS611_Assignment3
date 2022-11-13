package Character;

import java.util.ArrayList;

import Item.Item;
import LevelUp.LevelUpBehaviour;
import LevelUp.PaladinLevelUpBehaviour;
import LevelUp.SorcererLevelUpBehaviour;
import LevelUp.WarriorLevelUpBehaviour;

public class Hero extends Character {
	
	public Hero(String name) {
		for(HeroesEnum he : HeroesEnum.values()) {
			
            if (he.getName().equalsIgnoreCase(name)) {
            	setName(name);
        		setLevel(he.getLevel());
        		setHP(he.getHP());
        		setMP(he.getMP());
        		setStrength(he.getStrength());
        		setDexterity(he.getDexterity());
        		setAgility(he.getAgility());
        		setGold(he.getGold());
        		setExperience(he.getExperience());
        		if (he.getCategory() == "Paladin") {
        			lu = new PaladinLevelUpBehaviour();
        		} else if (he.getCategory() == "Warrior") {
        			lu = new WarriorLevelUpBehaviour();
        		} else if(he.getCategory() == "Sorcerer") {
        			lu = new SorcererLevelUpBehaviour();
        		}
        		break;
        		
            }
        }
	}
	
	private double MP;
	private long strength;
	private long dexterity;
	private long agility;
	private long gold;
	private int experience;
	protected LevelUpBehaviour lu;
	
	
	public void levelUp(Hero hero){
		lu.levelUp(hero);
	}
	
	private ArrayList<String> inventory = new ArrayList<String>();
	
	public double getMP() {
		return MP;
	}
	public void setMP(double d) {
		MP = d;
	}
	public long getStrength() {
		return strength;
	}
	public void setStrength(long strength) {
		this.strength = strength;
	}
	public long getDexterity() {
		return dexterity;
	}
	public void setDexterity(long dexterity) {
		this.dexterity = dexterity;
	}
	public long getAgility() {
		return agility;
	}
	public void setAgility(long agility) {
		this.agility = agility;
	}
	public long getGold() {
		return gold;
	}
	public void setGold(long gold) {
		this.gold = gold;
	}
	public ArrayList<String> getInventory() {
		return inventory;
	}
	public void setInventory(ArrayList<String> inventory) {
		this.inventory = inventory;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}
