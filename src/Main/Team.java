package Main;

import java.util.ArrayList;
import java.util.List;

import Character.Hero;

public class Team {
	
	private List<Hero> heroes = new ArrayList<Hero>();
	Hero h;
	private int curRow;
	private int curCol;
	private Move move;
	
	public Team(List<String> heroStrings) {
		for (String hero: heroStrings) {
			h = new Hero(hero);
			this.heroes.add(h);
			move = new Move();
		}
	}

	public List<Hero> getHeroes() {
		return heroes;
	}

	public void setHeroes(List<Hero> heroes) {
		this.heroes = heroes;
	}


	public int getCurRow() {
		return curRow;
	}


	public void setCurRow(int curRow) {
		this.curRow = curRow;
	}


	public int getCurCol() {
		return curCol;
	}


	public void setCurCol(int curCol) {
		this.curCol = curCol;
	}


	public Move getMove() {
		return move;
	}


	public void setMove(int i, int j) {
		this.move.setCurRow(i);
		this.move.setCurCol(j);
	}
	
}
	
