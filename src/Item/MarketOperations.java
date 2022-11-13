package Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Character.Hero;
import Character.HeroesEnum;
import Factory.FactoryItem;
import Main.InputValidation;
import Main.Print;
import Main.Team;

public class MarketOperations {
	static Scanner sc = new Scanner(System.in);
	static List<ArmorEnum> itemArmor = FactoryItem.initializeArmory();
	static List<PotionEnum> itemPotion = FactoryItem.initializePotion();
	static List<SpellEnum> itemSpells = FactoryItem.initializeSpell();
	static List<WeaponEnum> itemWeapon = FactoryItem.initializeWeapon();
	
	//buy
	
	
	//sell
	
	
	//enterMarket
	public static void enterMarket(Team t) {
		System.out.println("Hello, you're in the market! SOME RULES:");
		System.out.println("Each hero can individually buy/sell items using the gold they already have");
		System.out.println("Hero can only buy items equivalent to his level or less");
		
		
		String input = "b";
		
		while (!input.equals("q") || !input.equals("Q")) {
			//display
			Print.printInsideMarket();
			//take input
			input = sc.next();
			while(!InputValidation.validateInputForInsideMarket(input)) {
				System.out.println();
				System.out.print("Enter correct input: ");
				input = sc.next();
			}
			//conditions for different inputs
			switch(input) {
			case "i":
			case "I":
				Print.displayInfoAboutTeam(t);
				break;
				
			case "c":
			case "C":
				//check inventory
				Print.checkInventory(t);
				break;
			
			case "o":
			case "O":
				//move out of market
				break;
				
			case "b":
			case "B":
				displayMarket();
				System.out.println();
				buyItem(t);
				break;
			
			case "l":
			case "L":
				//sellItem();
				break;
				
			case "q":
			case "Q":
				break;
				
			}
			if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("o")) {
				break;
			}
		}
		System.out.println();
		
	}
	
	public static void buyItem(Team t) {
		List<Hero> heroes = t.getHeroes();
		System.out.println("Name/level/HP/MP/strength/dexterity/agility/gold/experience");
		for (Hero h: heroes) {
			System.out.println(h.getName() + "/" + h.getLevel() + "/" + h.getHP() + "/" + h.getMP() + "/" + h.getStrength() + "/" + h.getDexterity() + "/" + h.getAgility() + "/" + h.getGold() + "/" + h.getExperience());
			
		}
		System.out.println();
		System.out.println("Who would like to buy?");
		String hero = sc.next();
		while(!InputValidation.validateHeroName(hero)) {
			System.out.println();
			System.out.print("Enter correct name: ");
			hero = sc.next();
		}
		Hero heroObj = null;
		for(Hero he : heroes) {

			if (he.getName().equals(hero)) {
				heroObj = he;
			}
		}
		System.out.print("What would you like to buy?");
		String item = sc.next();
		System.out.println();
		while(!InputValidation.validateItemName(item)) {
			System.out.print("Enter correct item name: ");
			item = sc.next();
		}
		ArmorEnum armorToBuy = null;
		WeaponEnum weaponToBuy = null;
		PotionEnum potionToBuy = null;
		SpellEnum spellToBuy = null;
		for (ArmorEnum ae: ArmorEnum.values()) {
			if (ae.getName().equalsIgnoreCase(item)) {
				armorToBuy = ae;
				break;
			}
		}
		for (WeaponEnum ae: WeaponEnum.values()) {
			if (ae.getName().equalsIgnoreCase(item)) {
				weaponToBuy = ae;
				break;
			}
		}
		for (PotionEnum ae: PotionEnum.values()) {
			if (ae.getName().equalsIgnoreCase(item)) {
				potionToBuy = ae;
				break;
			}
		}
		for (SpellEnum ae: SpellEnum.values()) {
			if (ae.getName().equalsIgnoreCase(item)) {
				spellToBuy = ae;
				break;
			}
		}
		
		List<String> heroInventory = heroObj.getInventory();
		if (armorToBuy != null) {
			if (heroObj.getGold() >= armorToBuy.getCost() && heroObj.getLevel() >= armorToBuy.getReqLevel()) {
				heroInventory.add(armorToBuy.getName());
			} else 
				System.out.println("Select an item with the hero's experience level or one you can afford");
		} else if (weaponToBuy != null) {
			if (heroObj.getGold() >= weaponToBuy.getCost() && heroObj.getLevel() >= weaponToBuy.getReqLevel()) {
				heroInventory.add(weaponToBuy.getName());
			} else
				System.out.println("Select an item with the hero's experience level or one you can afford");
		} else if (potionToBuy != null) {
			if (heroObj.getGold() >= potionToBuy.getCost() && heroObj.getLevel() >= potionToBuy.getReqLevel()) {
				heroInventory.add(potionToBuy.getName());
			} else
				System.out.println("Select an item with the hero's experience level or one you can afford");
		} else if (spellToBuy != null) {
			if (heroObj.getGold() >= spellToBuy.getCost() && heroObj.getLevel() >= spellToBuy.getReqLevel()) {
				heroInventory.add(spellToBuy.getName());
			} else
				System.out.println("Select an item with the hero's experience level or one you can afford");
		}
		heroObj.setInventory((ArrayList<String>) heroInventory);
		
		
	}
	
	
	public static void displayMarket() {
		System.out.println("Armor");
		System.out.println("Name/cost/level/damage reduction");
		for (ArmorEnum item: itemArmor) {
			System.out.println(item.getName() + "/" + item.getCost() + "/" + item.getReqLevel() + "/" + item.getDamageRed());
		}
		System.out.println();
		System.out.println("Weapon");
		System.out.println("Name/cost/level/damage/required hands");
		for (WeaponEnum item: itemWeapon) {
			System.out.println(item.getName() + "/" + item.getCost() + "/" + item.getReqLevel() + "/" + item.getDamage() + "/" + item.getReqHands());
		}
		System.out.println();
		System.out.println("Potion");
		System.out.println("Name/cost/required level/attribute increase/attribute affected");
		for (PotionEnum item: itemPotion) {
			System.out.println(item.getName() + "/" + item.getCost() + "/" + item.getReqLevel() + "/" + item.getAttrIncrease() + "/" + item.getAttrAffected());
		}
		System.out.println();
		System.out.println("Spell");
		System.out.println("Name/cost/level/damage/Mana cost/spell type");
		for (SpellEnum item: itemSpells) {
			System.out.println(item.getName() + "/" + item.getCost() + "/" + item.getReqLevel() + "/" + item.getDamage() + "/" + item.getManaCost() + "/" + item.getSpellType());
		}
		
	}
	
	
	
}
