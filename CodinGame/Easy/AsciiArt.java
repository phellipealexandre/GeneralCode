import java.util.*;
import java.io.*;
import java.math.*;

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
                int index = getFirstIndex(letterAscii, l);
                myRow += rOW.substring(index, index+l);
            }
            
            System.out.println(myRow);
        }
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