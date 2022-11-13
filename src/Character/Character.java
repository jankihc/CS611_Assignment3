package Character;

public abstract class Character {
	private String Name;
	private int level;
	private long HP;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public long getHP() {
		return HP;
	}
	public void setHP(long hP) {
		HP = hP;
	}
}
