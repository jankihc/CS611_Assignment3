package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import BoardAndCell.Board;
import BoardAndCell.Cell;
import Character.HeroesEnum;
import Factory.FactoryBoard;
import Item.MarketOperations;

public class Play {
	static Scanner sc = new Scanner(System.in);
	static Team team;
	static Board b;
	static String input;
	static boolean validMove = false;

	public static void startPlay() {
		b = FactoryBoard.initializeBoard();
		System.out.println("Enter number of heroes between 1 to 3: ");
		int numberOfHeroes = sc.nextInt();
		while(!(numberOfHeroes >=1) && !(numberOfHeroes <=3)) {
			System.out.print("Enter correct number: ");
			numberOfHeroes = sc.nextInt();
		}
		System.out.println();
		Print.printStart();
		Print.printHeroes();

		String hero;
		List<String> heroes = new ArrayList<String>();

		

		for (int i = 0; i<(numberOfHeroes); i++) {
			System.out.print("Enter hero " + Integer.toString(i) + " for your team: ");
			hero = sc.next();
			while(!InputValidation.validateHeroName(hero)) {
				System.out.println();
				System.out.print("Enter correct name: ");
				hero = sc.next();
			}
			heroes.add(hero);
		}
		System.out.println();
		System.out.println(heroes.get(0));
		team = createTeam(heroes);//creating team
		updateCellLetterForTeam(team, b);//team will be shown as T on map
		b.display();//display the board the first time
		//input = KeyboardInput.takeInputForMarket(); //because 1st cell will always be market
		input="z";
		while (!input.equalsIgnoreCase("q")) {
			Move m = team.getMove();
			int curRow = m.getCurRow();
			int curCol = m.getCurCol();

			//find out kind of cell
			//take input
			if (isMarketCell(curRow, curCol, b)) {
				input = KeyboardInput.takeInputForMarket();

			} else if (isInaccessibleCell(curRow, curCol, b)) {
				System.out.println("Cannot enter cell");
			} else if (isCommonCell(curRow, curCol, b)) {
				if (shouldGenerateMonsters()) {
					//start battle
				} else {
					input = KeyboardInput.takeInputForCommon();
				}
			}

			//conditions for different inputs
			switch(input) {
			case "bo":
			case "BO":
				b = FactoryBoard.initializeBoard();
				b.display();
			case "i":
			case "I":
				Print.displayInfoAboutTeam(team);
				break;

			case "c":
			case "C":
				//check inventory
				Print.checkInventory(team);
				break;
			case "m":
			case "M":
				MarketOperations.enterMarket(team);
				break;
			case "w":
			case "W":
			case "a":
			case "A":
			case "s":
			case "S":
			case "d":
			case "D":
				validMove = moveTeam(team, input);
				if (!validMove) {
					System.out.println("INVALID MOVE/CELL NOT ACCESSIBLE.");
				} 

			case "h":
			case "H":
				//display map
				b.display();
				break;
			case "q":
			case "Q":
				break;
			}
			if (input.equalsIgnoreCase("q")) {
				break;
			}
		}

		//updateCellLetter
		//display board
		//take keyboard input to move team
		//MOVE TEAM


	}

	public static boolean moveTeam(Team team, String letter) {
		Move m = team.getMove();
		int curRow = m.getCurRow();
		int curCol = m.getCurCol();
		if (isValidMove(curRow, curCol, letter)) {
			if (letter.equals("W") || letter.equals("w")) {
				team.setMove(curRow-1, curCol);
			} else if (letter.equals("A") || letter.equals("a")) {
				team.setMove(curRow, curCol-1);
			} else if (letter.equals("s") || letter.equals("S")) {
				team.setMove(curRow+1, curCol);
			} else if (letter.equals("D") || letter.equals("d")) {
				team.setMove(curRow, curCol+1);
			}
			updateCellLetterForTeam(team, b);
			b.display();
			return true;
		} else {
			System.out.println("Invalid Move");
			return false;
		}
	}

	public static boolean isMarketCell(int i, int j, Board b) {
		List<List<Cell>> cells = b.getCells();
		if (cells.get(i).get(j).isCanEnterMarket()) {
			return true;
		}
		return false;
	}

	public static boolean isInaccessibleCell(int i, int j, Board b) {
		List<List<Cell>> cells = b.getCells();
		if (!cells.get(i).get(j).isCellEnter()) {
			return true;
		}
		return false;
	}

	public static boolean isCommonCell(int i, int j, Board b) {
		List<List<Cell>> cells = b.getCells();
		if (cells.get(i).get(j).isCellEnter() && !(cells.get(i).get(j).isCanEnterMarket())) {
			return true;
		}
		return false;
	}

	public static boolean shouldGenerateMonsters() {
		Random rand = new Random();
		int int_random = rand.nextInt(2);
		if (int_random == 1) {
			return true;
		}
		return false;
	}


	public static void updateCellLetterForTeam(Team team, Board b) {
		Move m = team.getMove();
		int curRow = m.getCurRow();
		int curCol = m.getCurCol();
		int prevRow = m.getPrevRow();
		int prevCol = m.getPrevCol();
		List<List<Cell>> cells = b.getCells();
		
		Cell prevCell = cells.get(prevRow).get(prevCol);
		prevCell.setLetter("   ");
		Cell curCell = cells.get(curRow).get(curCol);
		curCell.setLetter(" T ");
	}


	public static boolean isValidMove(int i, int j, String letter) {//using current position
		//TODO check for inaccessible cell
		if (letter.equals("W") || letter.equals("w")) {
			if ((i-1)>=0 && (i-1)<=8) {
				if (!isInaccessibleCell(i-1, j, b)) {
					return true;
				}

			}
		} else if (letter.equals("A") || letter.equals("a")) {
			if ((j-1)>=0 && (j-1)<=8) {
				if (!isInaccessibleCell(i, j-1, b)) {
					return true;
				}
				return true;
			}
		} else if (letter.equals("s") || letter.equals("S")) {
			if ((i+1)>=0 && (i+1)<=8) {
				if (!isInaccessibleCell(i+1, j, b)) {
					return true;
				}
				return true;
			}
		} else if (letter.equals("D") || letter.equals("d")) {
			if ((j+1)>=0 && (j+1)<=8) {
				if (!isInaccessibleCell(i, j+1, b)) {
					return true;
				}
				return true;
			}
		}
		return false;
	}

	public static Team createTeam(List<String> heroes) {
		Team team = new Team(heroes);
		return team;
	}

}
