package Main;

import java.util.Arrays;
import java.util.Scanner;

public class KeyboardInput {
	
	static Scanner sc = new Scanner(System.in);
	final static String[] inputForCommon = {"w", "a", "s", "d", "p", "s", "c", "W", "A", "S", "D", "P", "S", "C"};
	final static String[] inputForMarket = {"m", "M"};
	final static String[] inputForBattle = {};
	
	public static String takeInputForCommon() {
		String input;
		Print.printForInputCommonCell();
		input = sc.next();
		//validate input
		while(!InputValidation.validateInputForCommonCell(input)) {
			System.out.print("Please enter one of the letters from above: ");
			input = sc.next();
			System.out.println();
		}
		return input;
	}
	
	public static String takeInputForMarket() {
		String input;
		Print.printForInputMarketCell();
		input = sc.next();
		//validate input
		while(!InputValidation.validateInputForMarketCell(input)) {
			System.out.print("Please enter one of the letters from above: ");
			input = sc.next();
			System.out.println();
		}
		return input;
	}
	
	public static String takeInputDuringBattle() {
		String input = null;
		
		return input;
	}
	
	

}
