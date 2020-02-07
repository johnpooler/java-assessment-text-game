package com.qa.textbasedgame;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Random rand =new Random();
		
		String[] people= {"Adam", "Eve"};
		String playerName= people[rand.nextInt(people.length)];//assigning Adam or Eve
		
		
		System.out.println("\t Welcome, "+playerName+"!"+ "\n You have spawned in a gigantic garden..."+"\n Find the apple that fell from a tree.");
		System.out.println("----------------------------------------------------");
		
		
		
		// variables
		int xLimit=100;
		int yLimit=100;
		
		int x= rand.nextInt(xLimit);
		int y= rand.nextInt(yLimit);
		
		int stride= Math.abs(rand.nextInt(y/5) +4);
		int sideStep= Math.abs(rand.nextInt(x/10) +5);
		
		float distance= (float) Math.abs(Math.hypot(x, y)); 
		
//		System.out.println("stride is "+stride);
//		System.out.println("sideStep is "+sideStep);
//		boolean searching= true;
//		GAME:
//		while(searching) {
			while (distance>1) {
				System.out.println("\t Satan whispers: You are "+ distance+ "m away.");
				System.out.println("\t What would you like to do now? Type 1 to 4:" );
				System.out.println("\t 1. Go North!");
				System.out.println("\t 2. Head South!");
				System.out.println("\t 3. Redirect West!");
				System.out.println("\t 4. Sway East!");
				
				String input=scanner.nextLine();
				if (input.equals("1")) {
					distance+= stride;
					System.out.println("headed towards the icy north...");
			
				}
				
				else if (input.equals("2")) {
					distance-=stride;
					System.out.println("headed down undah...");
				}
				else if (input.equals("3")) {
					distance-=sideStep;
					System.out.println("headed to the Wild West...");
				}
				else if (input.equals("4")) {
					distance+=stride;
					System.out.println("headed to the east...");
				}
				else {System.out.println("wrong command silly billy! -> Try again.");}
				
			}
			if (distance<1) {
				System.out.println("------------------------------------------");
				System.out.println("CONGRATZ! ");
				}
//		}
		System.out.println("You have found the Apple, therefore we are all doomed :)");
		System.out.println("ty 4 playing");
		
			
		
		
		
		
		
		
		
		
		
		
		}
				
		
	}


