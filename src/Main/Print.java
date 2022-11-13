package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Character.Hero;

public class Print {
	
	public static void printStart() {
		System.out.println("Hello! Welcome to Legends Vs Monsters!");
		System.out.println("In this game, you'll be allowed to choose 3 heroes from a list of all the heroes.");
	}
	
	public static void printHeroes() {
		Map<String, List<String>> heroType = new HashMap<String, List<String>>();
		List<String> paladins = new ArrayList<String>();
		
		paladins.add("Amaryllis_Astra");
		paladins.add("Caliber_Heist");
		paladins.add("Garl_Glittergold");
		paladins.add("Parzival");
		paladins.add("Sehanine_Moonbow");
		paladins.add("Skoraeus_Stonebones");
		paladins.add("Kalabar");
		
		List<String> sorcerers = new ArrayList<String>();
		sorcerers.add("Kalabar");
		sorcerers.add("Reign_Havoc");
		sorcerers.add("Reverie_Ashels");
		sorcerers.add("Rillifane_Rallathil");
		sorcerers.add("Segojan_Earthcaller");
		sorcerers.add("Skye_Soar");
		
		List<String> warriors = new ArrayList<String>();
		warriors.add("Gaerdal_Ironhand");
		warriors.add("Sehanine_Monnbow");
		warriors.add("Muamman_Duathall");
		warriors.add("Flandal_Steelskin");
		warriors.add("Undefeated_Yoj");
		warriors.add("Eunoia_Cyn");
		
		heroType.put("Paladins", paladins);
		heroType.put("Warriors", warriors);
		heroType.put("Sorcerers", sorcerers);
		
		System.out.println("Select heroes");
		for (String heroT : heroType.keySet()){
			System.out.println(heroT);
			for (int i=1; i<=heroType.get(heroT).size(); i++) {
				System.out.println(Integer.toString(i) + ". " + heroType.get(heroT).get(i-1));
			}
		}
		
	}
	
	public static void displayInfoAboutTeam(Team t){
		List<Hero> heroes = t.getHeroes();
		for (Hero hero: heroes) {
			System.out.println("Name: " + hero.getName());
			System.out.println("Level: " + Integer.toString(hero.getLevel()));
			System.out.println("HP: " + Long.toString(hero.getHP()));
			System.out.println("MP: " + Double.toString(hero.getMP()));
			System.out.println("Strength: " + Long.toString(hero.getStrength()));
			System.out.println("Dexterity: " + Long.toString(hero.getDexterity()));
			System.out.println("Agility: " + Long.toString(hero.getAgility()));
			System.out.println("Gold: " + Long.toString(hero.getGold()));
			System.out.println("Experience: " + Long.toString(hero.getExperience()));
		}
		System.out.println();
	}
	
	public static void checkInventory(Team t){
		List<Hero> heroes = t.getHeroes();
		for (Hero hero: heroes) {
			System.out.println("Inventory for " + hero.getName());
			for (String item: hero.getInventory()) {
				System.out.println(item);
			}
		}
		System.out.println();
	}
	
	
	public static void printForInputCommonCell() {
		
		System.out.println("w/W: Up,  a/A: Left,  s/S: Down,  d/D: Right");
		System.out.println("i/I: Information about team");
		System.out.println("s/S: Show map,  c/C: Check inventory");
		System.out.println("q/Q: Quit");
		System.out.print("Please enter an input: ");
	}
	
	public static void printForInputMarketCell() {
		System.out.println("w/W: Up,  a/A: Left,  s/S: Down,  d/D: Right");
		System.out.println("m/M: Enter Market");
		System.out.println("i/I: Information about team");
		System.out.println("bo/BO: Reinitialize Board");
		System.out.println("h/H: Show map,  c/C: Check inventory");
		System.out.println("q/Q: Quit");
		System.out.print("Please enter an input: ");
	}
	
	public static void printInsideMarket() {
		
		System.out.println("b/B: Buy item,   l/L: Sell item");
		System.out.println("i/I: Information about team");
		System.out.println("c/C: Check inventory");
		System.out.println("o/O: Move out of market");
		System.out.println("q/Q: Quit Game");
		System.out.print("Please enter an input: ");
	}
}
