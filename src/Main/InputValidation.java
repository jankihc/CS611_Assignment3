package Main;

import java.util.Arrays;

import Character.HeroesEnum;
import Item.ArmorEnum;
import Item.PotionEnum;
import Item.SpellEnum;
import Item.WeaponEnum;

public class InputValidation {
	
	final static String[] inputForCommon = {"w", "a", "s", "d", "h", "c","i", "W", "A", "S", "D", "H", "C", "I"};
	final static String[] inputForMarket = {"m", "M"};
	final static String[] inputForInsideMarket = {"b", "B", "l", "L", "o", "O", "i", "I", "c", "C", "q", "Q"};
	final static String[] inputForBattle = {};

	public static boolean validateHeroName(String hero) {
		for(HeroesEnum he : HeroesEnum.values()) {

			if (he.getName().equalsIgnoreCase(hero)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean validateInputForCommonCell(String in) {
		if (Arrays.asList(inputForCommon).contains(in)) {
			return true;
		}
		return false;
	}
	
	public static boolean validateInputForMarketCell(String in) {
		if (Arrays.asList(inputForCommon).contains(in) || Arrays.asList(inputForMarket).contains(in)) {
			return true;
		}
		return false;
	}
	
	public static boolean validateInputForInsideMarket(String in) {
		if (Arrays.asList(inputForInsideMarket).contains(in)) {
			return true;
		}
		return false;
	}
	
	public static boolean validateItemName(String item) {
		for (ArmorEnum ae: ArmorEnum.values()) {
			if (ae.getName().equalsIgnoreCase(item)) {
				return true;
			}
		}
		for (WeaponEnum ae: WeaponEnum.values()) {
			if (ae.getName().equalsIgnoreCase(item)) {
				return true;
			}
		}
		for (PotionEnum ae: PotionEnum.values()) {
			if (ae.getName().equalsIgnoreCase(item)) {
				return true;
			}
		}
		for (SpellEnum ae: SpellEnum.values()) {
			if (ae.getName().equalsIgnoreCase(item)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
