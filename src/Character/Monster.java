package Character;

import LevelUp.PaladinLevelUpBehaviour;
import LevelUp.SorcererLevelUpBehaviour;
import LevelUp.WarriorLevelUpBehaviour;

public class Monster extends Character{
	
	public Monster(String name) {
		for(MonstersEnum m : MonstersEnum.values()) {
			
            if (m.getName().equalsIgnoreCase(name)) {
            	setName(name);
        		setLevel(m.getLevel());
        		setHP(m.getHP());
        		setDamage(m.getDamage());
        		setDefense(m.getDefense());
        		setDodge(m.getDodgeChance());
            }
        		
            }
        }
	private double damage;
	private long defense;
	private long dodge;
	
	public double getDamage() {
		return damage;
	}
	public void setDamage(double d) {
		this.damage = d;
	}
	public long getDefense() {
		return defense;
	}
	public void setDefense(long defense) {
		this.defense = defense;
	}
	public long getDodge() {
		return dodge;
	}
	public void setDodge(long dodge) {
		this.dodge = dodge;
	}
}
