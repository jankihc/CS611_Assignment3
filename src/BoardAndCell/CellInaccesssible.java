package BoardAndCell;

import java.awt.Color;
import java.awt.Graphics;

public class CellInaccesssible extends Cell {
	
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";

	public CellInaccesssible(int i, int j) {
		super(i, j);
		this.setColor(ANSI_CYAN_BACKGROUND);
		this.setLetter(" X ");
		this.setCellEnter(false);
		this.setCanEnterMarket(false);
	}
	
}
