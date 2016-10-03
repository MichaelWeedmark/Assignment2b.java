/******************************************************************************
 * 
 * Made by Michael Weedmark
 * Made on 2016-10-03
 * Made for ICS4U, Assignment 2B
 * This program replicates Rock, Paper, Scissors
 * 
******************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class Main {
	
    public static void main(String[]args){
    	System.out.print("Please enter Rock(1), Paper(2), or scissors(3).");
    	
    	//Variables
        Scanner UserInput = new Scanner(System.in);
        Random rng = new Random();
        int rps = rng.nextInt(3)+1;
        int Input = UserInput.nextInt();
        
        //Determines who won, Java wont let me put both an int and 
        //string in an "if and" so the user inputs an int
        if ((rps == 1)&&(Input == 1)){
        	
        	System.out.println("Computer chose Rock");
        	System.out.println("Tied!");
        	
        } else if ((rps == 2)&&(Input == 1)){
        	
        	System.out.println("Computer chose Paper");
        	System.out.println("You lost!");
        	
        } else if ((rps == 3)&&(Input == 1)){
        	
        	System.out.println("Computer chose Scissors");
        	System.out.println("You won!");
        	
        } else if ((rps == 1)&&(Input == 2)){
        	
        	System.out.println("Computer chose Rock");
        	System.out.println("You won!");
        	
        } else if ((rps == 2)&&(Input == 2)){
        	
        	System.out.println("Computer chose Paper");
        	System.out.println("Tied!");
        	
        } else if ((rps == 3)&&(Input == 2)){
        	
        	System.out.println("Computer chose Scissors");
        	System.out.println("You lost!");
        	
        } else if ((rps == 1)&&(Input == 3)){
        	
        	System.out.println("Computer chose Rock");
        	System.out.println("You lost!");
        	
        } else if ((rps == 2)&&(Input == 3)){
        	
        	System.out.println("Computer chose Paper");
        	System.out.println("You Won!");
        	
        } else if ((rps == 3)&&(Input == 3)){
        	
        	System.out.println("Computer chose Scissors");
        	System.out.println("Tied!");
        	
        } else {
        	
        	//If the user entered something invalid
        	System.out.println("Something went wrong. Try entering a valid number (1,2,3).");
        	
        }
    }  
}
