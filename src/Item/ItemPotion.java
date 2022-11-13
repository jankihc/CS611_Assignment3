package Item;

public class ItemPotion extends Item{
	private long attributeIncrease;
	private String attributeAffected;

	public long getAttributeIncrease() {
		return attributeIncrease;
	}

	public void setAttributeIncrease(long attributeIncrease) {
		this.attributeIncrease = attributeIncrease;
	}

	public String getAttributeAffected() {
		return attributeAffected;
	}

	public void setAttributeAffected(String attributeAffected) {
		this.attributeAffected = attributeAffected;
	}
	
}
