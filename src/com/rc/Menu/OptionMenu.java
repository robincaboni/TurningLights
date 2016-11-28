package com.rc.Menu;

import java.util.Scanner;

import com.rc.light.DisplayLight;
public class OptionMenu {
    
    public static void main(String [] args) throws InterruptedException{
        
        Scanner in = new Scanner(System.in);
        Boolean yn;
        String choice;
        int choice2;
        
        // Display the menu
        System.out.println("== Java Programming ==");
        // Number of lights
        System.out.println("Do you want to define the number of lights ? (Y/N)");
        while (true) {
        	choice = in.nextLine().trim().toLowerCase();
        	if (choice.equals("y")) {
        		yn = true;
        	    break;
        	} else if (choice.equals("n")) {
        	    yn = false;
        	    break;
        	} else {
        	     System.out.println("Sorry, please answer y/n");
        	}
        }
        
        if(yn == true){
			System.out.println("Please enter the number of lights (>0):");
		    while (!in.hasNextInt()) {
		        System.out.println("Please enter a positive number");
		        in.next();
		    }
		    choice2 = in.nextInt();
	        System.out.println("Number of lights: "+choice2);
	        //we call the function
	        DisplayLight display_light = new DisplayLight();
	        display_light.run(choice2);
        } else{
    	    System.out.println("Default value: 20 lights");
	        //we call the function
	        DisplayLight display_light = new DisplayLight();
	        display_light.run(20);
        }
        
    }
}
