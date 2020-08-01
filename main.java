package textAdventure;
import java.util.Random;
import java.util.Scanner;

public class main {
     public static void main(String[] args)	{
    	 Scanner in= new Scanner(System.in);
    	 Random rand = new Random(); 
    	 
    	 //game variables
    	String[] enemies = {"Skeleton","Zombie","Warrior","Assasian"};
    	int maxEnemyHealth=75;
    	int enemyAttackDamage=25;
    	//player variables
    	int health=100;
    	int attackDamage=50;
    	int healthPotions=3;
    	int healthPotionHealAmount = 30;
    	int healthPotionDropChance = 50;//percentage
    	
    	boolean running =true;
    	
    	System.out.println("Welcome to the YATIN's ADVENTURE GAME!!!!!");
    	
    	
    	GAME:
    		while(running) {
    			System.out.println("------------------------------------------------");
    			
    			int enemyHealth = rand.nextInt(maxEnemyHealth);
    			String enemy = enemies[rand.nextInt(enemies.length)];
    			System.out.println("\t#"+enemy+"has appeared.Fight your best!!! #\t");
    			
    			while(enemyHealth > 0) {
    				System.out.println("\tYour HP: "+ health);
    				System.out.println("\t"+enemy+"'s HP:" + enemyHealth);
    				System.out.println("\n\tWhat would you like to do gamer??");
    				System.out.println("\t1.Attack");
    				System.out.println("\t2.Drink Health Potion");
    				System.out.println("\t3.Run");
    				
    				String input = in.nextLine();
    				if(input.equals("1")) {
    					int damageDealt = rand.nextInt(attackDamage);
    					int damageTaken = rand.nextInt(enemyAttackDamage);
    					
    					enemyHealth -= damageDealt;
    					health -= damageTaken;
    					
    					System.out.println("\t> You strike the"+ enemy +"for" + damageDealt + "damage");
    					System.out.println("\t> You receive "+ damageTaken + "in reteliation");
    					
    					if(health<1) {
    						System.out.println("You have taken so much damage .you are too weak bro.. to go ON!!!");
    						break;
    					}
    				}
    				else if(input.contentEquals("2")) {
    					if(healthPotions>0) {
    						health += healthPotionHealAmount;
    						healthPotions--;
    						System.out.println("\t>You drink a health potion, healing yourself for" +healthPotionHealAmount+"\n\t You now have "+ health + "HP"+"\n\t You now have"+ healthPotions + "healthpotions left\n" );
    					}
    					else
    						System.out.println("\tYou have no health potions left.Defeat your enemies to get more health potions!!!");
    				}
    				else if(input.contentEquals("3")) {
    					System.out.println("You ran away from the enemy");
    					continue GAME;
    				}
    				else {
    					System.out.println("Invalid Command!!");
    				}
    				
    				
    			}
    			if (health < 1) {
    				System.out.println("You limp out of the dungeon. weak from from the batttle!!");
    				break;
    			}
    			System.out.println("--------------------------------------------------");
    			System.out.println(" # " + enemy + "was defeated!! #");
    			System.out.println("# You have" + healthPotions + "healthPotions! #");
    			if(rand.nextInt(100)< healthPotionDropChance)
    			{
    				healthPotions++;
    				System.out.println("# the "+enemy+"dropped a health Potion!! #");
    				System.out.println("# You now have "+healthPotions+"healthpotions left!!  #");
    				}
    			System.out.println("--------------------------------------------------------");
    			System.out.println("WHat would you like to do now?");
    			System.out.println("\n1.Continue Fighting??");
    			System.out.println("\n2.Exit GAme");
    			
    			String input = in.nextLine();
    			
    			while(!input.equals("1")&& !input.equals("2")) {
    				System.out.println("Invalid command");
    				input=in.nextLine();
    			}
    			if(input.contentEquals("1")) {
    				System.out.println("You continue on your adventure!!");
    				
    			}
    			else if(input.contentEquals("2")) {	
    				System.out.println("You exxit the game.Sussesful from your game!");
    				break;
    			}
    			}
    	System.out.println("----------------------");
    	System.out.println("# Thanks for Playing!!! #");
    	System.out.println("------------------------");
     }


}
