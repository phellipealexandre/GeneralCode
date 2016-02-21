import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        in.nextLine();
        int h = in.nextInt();
        in.nextLine();
        String t = in.nextLine().toUpperCase();
        
        int strLength = t.length();
        
            
        for (int i = 0; i < h; i++) {
            String rOW = in.nextLine();
            
            String myRow = "";
            for (char c : t.toCharArray()){
                int letterAscii = ((int) c)-65;
                //System.err.println(letterAscii);
                
                int index = getFirstIndex(letterAscii, l);
                myRow += rOW.substring(index, index+l);
            }
            
            System.out.println(myRow);
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
    }
    
    private static int getFirstIndex(int letter, int width) {
        int index = 0;
        if (letter < 0 || letter > 25) {
            index = 26 * width;
        } else {
            index = letter * width;
        }
        return index;
    }
}