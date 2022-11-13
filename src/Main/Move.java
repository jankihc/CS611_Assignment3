package Main;

public class Move {
	
	private int curRow;
	private int curCol;
	private int prevRow;
	private int prevCol;
	
	//whenever move class is created, team's position is initialized to 0,0
	public Move() {
		this.setPrevRow(0);
		this.setPrevCol(0);
		this.setCurRow(0);
		this.setCurCol(0);
	}
	
	
	public int getCurRow() {
		return curRow;
	}
	public void setCurRow(int curRow) {
		setPrevRow(this.curRow);
		this.curRow = curRow;
	}
	public int getCurCol() {
		return curCol;
	}
	public void setCurCol(int curCol) {
		setPrevCol(this.curRow);
		this.curCol = curCol;
	}
	public int getPrevRow() {
		return prevRow;
	}
	public void setPrevRow(int prevRow) {
		this.prevRow = prevRow;
	}
	public int getPrevCol() {
		return prevCol;
	}
	public void setPrevCol(int prevCol) {
		this.prevCol = prevCol;
	}

	
	
	
}
