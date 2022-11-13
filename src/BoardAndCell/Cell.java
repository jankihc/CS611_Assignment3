package BoardAndCell;

public abstract class Cell {
	
	private int row, column;
	private String color;
	private String letter;
	private boolean cellEnter = false;
	private boolean isTeamPresent = false;
	private boolean canEnterMarket = false;
	
	public Cell(int i, int j) {
		this.setRow(i);
		this.setColumn(j);
		
		
	}
	
//	public String display() {
//		
//		return ;
//		
//	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public boolean isTeamPresent() {
		return isTeamPresent;
	}

	public void setTeamPresent(boolean isTeamPresent) {
		this.isTeamPresent = isTeamPresent;
	}

	public boolean isCellEnter() {
		return cellEnter;
	}

	public void setCellEnter(boolean cellEnter) {
		this.cellEnter = cellEnter;
	}

	public boolean isCanEnterMarket() {
		return canEnterMarket;
	}

	public void setCanEnterMarket(boolean canEnterMarket) {
		this.canEnterMarket = canEnterMarket;
	}

}
