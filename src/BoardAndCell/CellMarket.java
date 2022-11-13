package BoardAndCell;

import java.awt.Color;
import java.awt.Graphics;

public class CellMarket extends Cell {
	
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

	public CellMarket(int i, int j) {
		super(i, j);
		this.setColor(ANSI_GREEN_BACKGROUND);
		this.setLetter(" M ");
		this.setCellEnter(false);
		this.setCanEnterMarket(true);
	}

}
