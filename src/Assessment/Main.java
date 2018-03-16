package Assessment;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		boolean gameActive = true; 
		Scanner in = new Scanner(System.in);
        
        int x = 0;
        int y = 0;
      
        while (gameActive) {
        	for (int i = 0; i < 10; i++) {
        		for (int j = 0; j < 10; j++) {
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
       
       // if ((t.getTX()==x)) {
        //	System.out.println("Found treasure!");
        //	}

        System.out.println("You notice a small watch-like device in your left hand. \n" + 
        		"\r\n"
				+ "It has hands like a watch, but the hands don't seem to tell time, how mysterious...." + 
        		"\r\n");;
      
    }		
       
       
        
	}

	//private static boolean getTY() {
		// TODO Auto-generated method stub
		//return false;
	}

	


