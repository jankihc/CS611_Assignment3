package Battle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Character.Hero;
import Character.Monster;
import Character.MonstersEnum;
import Item.ArmorEnum;
import Item.PotionEnum;
import Item.SpellEnum;
import Item.WeaponEnum;
import Main.Team;

public class Battle {
	static Scanner sc = new Scanner(System.in);
	
	public void start(Team t) {
		boolean gameOver = false;
		while(!gameOver) {
			Round r = new Round();
			r.TeamTurn(t);
		}
		//generate monsters according to number of heroes and their levels
		//initiate round
		//round will have list of heroes, list of monsters
		//heroturn - give options about what to do
		
	}
	
	public Map<Hero, Monster> getHeroMonsterMap(Team t){
		Map<Hero, Monster> map = new HashMap<Hero, Monster>();
		List<Hero> heroes = t.getHeroes();
		Monster monster = null;
		for (Hero h: heroes) {
			for (MonstersEnum m: MonstersEnum.values()) {
				if (m.getLevel() == h.getLevel()) {
					monster = new Monster(m.getName());
					break;
				}
			}
			map.put(h, monster);
		}
		return map;
	}
	
}
