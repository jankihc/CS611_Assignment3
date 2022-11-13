# CS611-Assignment 3

## Heroes Vs Monsters

---------------------------------------------------------------------------

Janki Hemant Chauhan

jankihc@bu.edu

U87928510



## Files

---------------------------------------------------------------------------

Main.java : Start point of the game

Play.java : Allows to start play. Contains methods to check for type of cell, to move the team from one cell to another, to create team, and to check the validity of a move. StartPlay loops through options continuously till the player quits the game.

Team.java : Allows to create a team of heroes, where the number of heroes can be between 1 and 3. Also stores the position of the team by creating an instance of the move class.

Move.java : Stores the current and previous positions of the team of heroes.

KeyBoardInput.java : Contains methods to take inputs for different kind of cells.

Print.java : Contains methods to print rules and options under various conditions.

InputValidation.java: Contains methods to validate any input from the player.

Board.java: Creates a board for the game with different kinds of cells.

Cell.java: Board comprises of cells. This is the superclass for different kinds of cells.

CellCommon.java: Denotes the common spaces of the board.

CellInaccessible.java: Denotes the inaccessible spaces of the board, the ones where the heroes cannot enter.

CellMarket.java: Denoted the Market spaces from where the heroes can buy items for the battle.

Character.java: Super class for making objects of heroes and monsters.

Hero.java: Object class for heroes. Contains attributes to store hero's strength, HP, etc.

Monster.java: Object class for monsters. Contains attributes like damage caused, etc.

HeroesEnum.java: Enum to store heroes and retrieve their attributes.

MonstersEnum.java: Enum to store monsters and retrieve their attributes.

Item.java: Super class for all items available in the market.

ItemArmor.java: Class to create object for armory.

ItemPotion.java: Class to create object for potions.

ItemWeapon.java: Class to create object for weapons.

ItemRules.java: Class to create object for Spells.

ArmorEnum.java: Enum for storing all types of armor and retrieve their attributes.

PotionEnum.java: Enum for storing all types of potions and retrieve their attributes.

SpellEnum.java: Enum for storing all types of spells and retrieve their attributes.

WeaponEnum.java: Enum for storing all types of weapons and retrieve their attributes.

MarketOperations.java: Class that contains all methods and functionalities that can be performed in the market.

Factory.java: Parent factory class to initialize objects.

FactoryBoard.java: Factory class for initializing a board object.

FactoryCharacter.java: Factory class for initializing heroes and monsters.

FactoryItem.java: Factory class for initializing items in the market.

Battle.java: Class which contains functionalities for the battle between heroes and monsters.

Round.java: Each battle consists of multiple rounds. This is initiated every time for a new round.

LevelUpBehaviour.java: Strategy parent class for allowing heroes to level up.

PaladinLevelUpBehaviour.java: Strategy class for updating values for Paladins while leveling up.

SorcererLevelUpBehaviour.java: Strategy class for updating values for Sorcerers while leveling up. 

WarriorLevelUpBehaviour.java: Strategy class for updating values for Warrior while leveling up.

BattleOverBehaviour.java: Supposed to be a strategy parent class for after the battle is over.

BattleWinBehaviour.java: Supposed to be a strategy class for win behavior of heroes after battle is over.

BattleLoseBehaviour.java: Supposed to be a strategy class for lose behavior of heroes after battle is over.



## How to compile and run

---------------------------------------------------------------------------

Navigate to src package.

javac Main.java

java Main





## Input/Output Example

---------------------------------------------------------------------------


Enter number of heroes between 1 to 3: 
1

Hello! Welcome to Legends Vs Monsters!
In this game, you'll be allowed to choose 3 heroes from a list of all the heroes.
Select heroes
Sorcerers
1. Kalabar
2. Reign_Havoc
3. Reverie_Ashels
4. Rillifane_Rallathil
5. Segojan_Earthcaller
6. Skye_Soar
Warriors
1. Gaerdal_Ironhand
2. Sehanine_Monnbow
3. Muamman_Duathall
4. Flandal_Steelskin
5. Undefeated_Yoj
6. Eunoia_Cyn
Paladins
1. Amaryllis_Astra
2. Caliber_Heist
3. Garl_Glittergold
4. Parzival
5. Sehanine_Moonbow
6. Skoraeus_Stonebones
7. Kalabar
Enter hero 0 for your team: Parzival

Parzival
[42m T [0m    [41m      [0m    [46m X [0m    [41m      [0m    [46m X [0m    [42m M [0m    [41m      [0m    

[41m      [0m    [46m X [0m    [46m X [0m    [46m X [0m    [42m M [0m    [42m M [0m    [41m      [0m    

[46m X [0m    [46m X [0m    [42m M [0m    [42m M [0m    [42m M [0m    [41m      [0m    [41m      [0m    

[41m      [0m    [46m X [0m    [42m M [0m    [46m X [0m    [46m X [0m    [41m      [0m    [46m X [0m    

[41m      [0m    [41m      [0m    [46m X [0m    [41m      [0m    [41m      [0m    [41m      [0m    [42m M [0m    

[41m      [0m    [42m M [0m    [41m      [0m    [42m M [0m    [41m      [0m    [42m M [0m    [42m M [0m    

[41m      [0m    [42m M [0m    [42m M [0m    [41m      [0m    [42m M [0m    [41m      [0m    [41m      [0m    

[41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    

Blue: Inaccessible Space
Green: Market Space (Each player can buy items with his gold and add it to his inventory. Players can also sell their items at half the cost)
Red: Common Space (There may/may not be monsters for the team to fight)
w/W: Up,    a/A: Left,    s/S: Down,    d/D: Right
m/M: Enter Market
i/I: Information about team
bo/BO: Reinitialize Board
h/H: Show map,    c/C: Check inventory
q/Q: Quit
Please enter an input: s
[42m T [0m    [41m      [0m    [46m X [0m    [41m      [0m    [46m X [0m    [42m M [0m    [41m      [0m    

[41m T [0m    [46m X [0m    [46m X [0m    [46m X [0m    [42m M [0m    [42m M [0m    [41m      [0m    

[46m X [0m    [46m X [0m    [42m M [0m    [42m M [0m    [42m M [0m    [41m      [0m    [41m      [0m    

[41m      [0m    [46m X [0m    [42m M [0m    [46m X [0m    [46m X [0m    [41m      [0m    [46m X [0m    

[41m      [0m    [41m      [0m    [46m X [0m    [41m      [0m    [41m      [0m    [41m      [0m    [42m M [0m    

[41m      [0m    [42m M [0m    [41m      [0m    [42m M [0m    [41m      [0m    [42m M [0m    [42m M [0m    

[41m      [0m    [42m M [0m    [42m M [0m    [41m      [0m    [42m M [0m    [41m      [0m    [41m      [0m    

[41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    

Blue: Inaccessible Space
Green: Market Space (Each player can buy items with his gold and add it to his inventory. Players can also sell their items at half the cost)
Red: Common Space (There may/may not be monsters for the team to fight)
[42m T [0m    [41m      [0m    [46m X [0m    [41m      [0m    [46m X [0m    [42m M [0m    [41m      [0m    

[41m T [0m    [46m X [0m    [46m X [0m    [46m X [0m    [42m M [0m    [42m M [0m    [41m      [0m    

[46m X [0m    [46m X [0m    [42m M [0m    [42m M [0m    [42m M [0m    [41m      [0m    [41m      [0m    

[41m      [0m    [46m X [0m    [42m M [0m    [46m X [0m    [46m X [0m    [41m      [0m    [46m X [0m    

[41m      [0m    [41m      [0m    [46m X [0m    [41m      [0m    [41m      [0m    [41m      [0m    [42m M [0m    

[41m      [0m    [42m M [0m    [41m      [0m    [42m M [0m    [41m      [0m    [42m M [0m    [42m M [0m    

[41m      [0m    [42m M [0m    [42m M [0m    [41m      [0m    [42m M [0m    [41m      [0m    [41m      [0m    

[41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    

Blue: Inaccessible Space
Green: Market Space (Each player can buy items with his gold and add it to his inventory. Players can also sell their items at half the cost)
Red: Common Space (There may/may not be monsters for the team to fight)
w/W: Up,    a/A: Left,    s/S: Down,    d/D: Right
i/I: Information about team
s/S: Show map,    c/C: Check inventory
q/Q: Quit
Please enter an input: w
Invalid Move
INVALID MOVE/CELL NOT ACCESSIBLE.
[42m T [0m    [41m      [0m    [46m X [0m    [41m      [0m    [46m X [0m    [42m M [0m    [41m      [0m    

[41m T [0m    [46m X [0m    [46m X [0m    [46m X [0m    [42m M [0m    [42m M [0m    [41m      [0m    

[46m X [0m    [46m X [0m    [42m M [0m    [42m M [0m    [42m M [0m    [41m      [0m    [41m      [0m    

[41m      [0m    [46m X [0m    [42m M [0m    [46m X [0m    [46m X [0m    [41m      [0m    [46m X [0m    

[41m      [0m    [41m      [0m    [46m X [0m    [41m      [0m    [41m      [0m    [41m      [0m    [42m M [0m    

[41m      [0m    [42m M [0m    [41m      [0m    [42m M [0m    [41m      [0m    [42m M [0m    [42m M [0m    

[41m      [0m    [42m M [0m    [42m M [0m    [41m      [0m    [42m M [0m    [41m      [0m    [41m      [0m    

[41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    

Blue: Inaccessible Space
Green: Market Space (Each player can buy items with his gold and add it to his inventory. Players can also sell their items at half the cost)
Red: Common Space (There may/may not be monsters for the team to fight)
Invalid Move
INVALID MOVE/CELL NOT ACCESSIBLE.
[42m T [0m    [41m      [0m    [46m X [0m    [41m      [0m    [46m X [0m    [42m M [0m    [41m      [0m    

[41m T [0m    [46m X [0m    [46m X [0m    [46m X [0m    [42m M [0m    [42m M [0m    [41m      [0m    

[46m X [0m    [46m X [0m    [42m M [0m    [42m M [0m    [42m M [0m    [41m      [0m    [41m      [0m    

[41m      [0m    [46m X [0m    [42m M [0m    [46m X [0m    [46m X [0m    [41m      [0m    [46m X [0m    

[41m      [0m    [41m      [0m    [46m X [0m    [41m      [0m    [41m      [0m    [41m      [0m    [42m M [0m    

[41m      [0m    [42m M [0m    [41m      [0m    [42m M [0m    [41m      [0m    [42m M [0m    [42m M [0m    

[41m      [0m    [42m M [0m    [42m M [0m    [41m      [0m    [42m M [0m    [41m      [0m    [41m      [0m    

[41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    

Blue: Inaccessible Space
Green: Market Space (Each player can buy items with his gold and add it to his inventory. Players can also sell their items at half the cost)
Red: Common Space (There may/may not be monsters for the team to fight)
Invalid Move
INVALID MOVE/CELL NOT ACCESSIBLE.
[42m T [0m    [41m      [0m    [46m X [0m    [41m      [0m    [46m X [0m    [42m M [0m    [41m      [0m    

[41m T [0m    [46m X [0m    [46m X [0m    [46m X [0m    [42m M [0m    [42m M [0m    [41m      [0m    

[46m X [0m    [46m X [0m    [42m M [0m    [42m M [0m    [42m M [0m    [41m      [0m    [41m      [0m    

[41m      [0m    [46m X [0m    [42m M [0m    [46m X [0m    [46m X [0m    [41m      [0m    [46m X [0m    

[41m      [0m    [41m      [0m    [46m X [0m    [41m      [0m    [41m      [0m    [41m      [0m    [42m M [0m    

[41m      [0m    [42m M [0m    [41m      [0m    [42m M [0m    [41m      [0m    [42m M [0m    [42m M [0m    

[41m      [0m    [42m M [0m    [42m M [0m    [41m      [0m    [42m M [0m    [41m      [0m    [41m      [0m    

[41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    [41m      [0m    

Blue: Inaccessible Space
Green: Market Space (Each player can buy items with his gold and add it to his inventory. Players can also sell their items at half the cost)
Red: Common Space (There may/may not be monsters for the team to fight)
w/W: Up,    a/A: Left,    s/S: Down,    d/D: Right
i/I: Information about team
s/S: Show map,    c/C: Check inventory
q/Q: Quit
Please enter an input: 






