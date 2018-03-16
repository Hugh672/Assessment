package Assessment;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Treasure treasure = new Treasure();
		
		System.out.println("Type Look");
		
		boolean gameActive = true; 
		Scanner in = new Scanner(System.in);
        
        int x = 5;   //starting location (centre of Grid)
        int y = 5;   //starting location (centre of Grid)
      
        while (gameActive) {
        	for (int i = 0; i < 11; i++) {
        		for (int j = 0; j < 11; j++) {
        			if (i ==y & j ==x) {
        			 System.out.print("O");    //Characters Position
        			 
                } else {
                        System.out.print("X");  
                }
        }
        System.out.println("");

        				
        }

        System.out.println("Type Exit to quit Game");
        String move = in.next();
        if (move.equals("Exit")) { 
                gameActive = false;
        }
        
        if (move.equals("Look")) { 
            System.out.println("Grey foggy clouds float oppressively close to you,\r\n" + 
            		"\r\n" + 
            		"reflected in the murky grey water which reaches up your shins.\r\n" + 
            		"\r\n" + 
            		"Some black plants barely poke out of the shallow water.\r\n" + 
            		"\r\n" + 
            		"Try Exploring using \"North\",\"South\",\"East\" or \"West\"" + 
            		"\r\n" + 
            		"You notice a small watch-like device in your left hand. \n" + 
            		"\r\n"
    				+ "It has hands like a watch, but the hands don't seem to tell time, how mysterious.... perhaps there is treasure nearby?" + 
            		"\r\n");;
    }
        if (move.equals("North")) { 
                y--;
        }
        if (move.equals("South")) {
        		y++;
        }		
        if (move.equals("West")) {
    			x--;
        }		
        if (move.equals("East")) {
    			x++;
        }
       
       
		if ((treasure.getTX()==x)) { // && (treasure.getTY()==y)){
        	System.out.println("Found treasure!");
        	}

    }		
       // public static double Distance(Player p, Treasure t) {
    	//	int x = p.getTX() - t.getTX();
    		// int y = p.getTY() - t.getTY();
    		
    		// double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    		
    		// return distance;
       
        
	}

	
	}

	


