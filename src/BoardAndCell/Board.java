package BoardAndCell;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
	
	
	List<List<Cell>> cells = new ArrayList<List<Cell>>();
	List<Cell> cellCols = new ArrayList<Cell>();
	Random rand = new Random();
	int count_0, count_1, count_2 = 0;
	
	public static final String ANSI_RESET = "\u001B[0m";
	//display
	public void display() {
		for(int i=1; i<=cells.size(); i++){
			for (int j=1; j<cells.size(); j++) {
				
			
			System.out.print(cells.get(i-1).get(j-1).getColor() + cells.get(i-1).get(j-1).getLetter()
			+ ANSI_RESET);
			System.out.print("  ");
			
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("Blue: Inaccessible Space");
		System.out.println("Green: Market Space (Each player can buy items with his gold and add it to his inventory. Players can also sell their items at half the cost)");
		System.out.println("Red: Common Space (There may/may not be monsters for the team to fight)");
		
	}
	
	
	public List<List<Cell>> getCells() {
		return cells;
	}


	public void setCells(List<List<Cell>> cells) {
		this.cells = cells;
	}


	//initialize cells to different types
	public void createCells() {
	    for(int x = 0; x < 8; x++) {
	        for(int y = 0; y < 8; y++) {
	        	if (x == 0 && y == 0) {
	        		cellCols.add(new CellMarket(x, y));
	        		count_1++;
	        		continue;
	        	}
	        	boolean cellAdded = false;
	        	while(!cellAdded) {
	        		int int_random = rand.nextInt(3);
		        	if (int_random == 0) {
		        		if (count_0 < 13){
		        			cellCols.add(new CellInaccesssible(x, y));
		        			count_0++;
		        			cellAdded = true;
		        		}
		        	} else if (int_random == 1){
		        		if (count_1 < 19) {
		        			cellCols.add(new CellMarket(x, y));
		        			count_1++;
		        			cellAdded = true;
		        		}
		        	} else if (int_random == 2) {
		        		if (count_2 < 32) {
		        			cellCols.add(new CellCommon(x, y));
		        			count_2++;
		        			cellAdded = true;
		        		}
		        	} 
	        	}
	        	
	        }
	        cells.add(cellCols);
        	cellCols = new ArrayList<Cell>();
	    }
	}
	
}


