import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int fireIndex = 0;
            int maxHeight = 0;
            
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();
            
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                
                if (mountainH > maxHeight) {
                    maxHeight = mountainH;
                    fireIndex = i;
                }    
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if (spaceX == fireIndex) {
                System.out.println("FIRE"); // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).               
            } else {
                System.out.println("HOLD"); // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).                
            }
 
        }
    }
}