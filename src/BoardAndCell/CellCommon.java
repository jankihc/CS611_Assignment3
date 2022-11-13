package BoardAndCell;

import java.awt.Color;
import java.awt.Graphics;

public class CellCommon extends Cell {
	
	public static final String ANSI_RED_BACKGROUND
    = "\u001B[41m";

	public CellCommon(int i, int j) {
		super(i, j);
		this.setColor(ANSI_RED_BACKGROUND);
		this.setLetter("   ");
		this.setCellEnter(true);
		this.setCanEnterMarket(false);
	}
	

}
