package Battle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Character.Hero;
import Item.ArmorEnum;
import Item.PotionEnum;
import Item.SpellEnum;
import Item.WeaponEnum;
import Main.Team;

public class Round {
	static Scanner sc = new Scanner(System.in);
	
	public void TeamTurn(Team t) {
		List<Hero> heroes = t.getHeroes();
		String itemToUse = null;
		for (Hero h: heroes) {
			System.out.println("What would you like to use?");
			ArrayList<String> inventory = h.getInventory();
			for (String item: inventory) {
				System.out.println(item);
			}
			itemToUse = sc.next();
			while(!inventory.contains(itemToUse)) {
				System.out.println("Enter correct option: ");
				itemToUse = sc.next();
				
			}
			ArmorEnum armorToUse = null;
			WeaponEnum weaponToUse = null;
			PotionEnum potionToUse = null;
			SpellEnum spellToUse = null;
			for (ArmorEnum ae: ArmorEnum.values()) {
				if (ae.getName().equalsIgnoreCase(itemToUse)) {
					armorToUse = ae;
					break;
				}
			}
			for (WeaponEnum ae: WeaponEnum.values()) {
				if (ae.getName().equalsIgnoreCase(itemToUse)) {
					weaponToUse = ae;
					break;
				}
			}
			for (PotionEnum ae: PotionEnum.values()) {
				if (ae.getName().equalsIgnoreCase(itemToUse)) {
					potionToUse = ae;
					break;
				}
			}
			for (SpellEnum ae: SpellEnum.values()) {
				if (ae.getName().equalsIgnoreCase(itemToUse)) {
					spellToUse = ae;
					break;
				}
			}
			if (armorToUse != null) {
				//equip with armor
			} else if(weaponToUse != null) {
				//attackMonster
			} else if(potionToUse != null) {
				//use health potion for self and increase HP
			} else if(spellToUse != null) {
				//cast spell on monster
			}
			
			//MONSTER TURN
			
		}
		
		
	}
	
}
