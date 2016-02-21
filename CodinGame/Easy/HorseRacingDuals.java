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
        int N = in.nextInt();
        List<Integer> strenghts = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            strenghts.add(pi);
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        Collections.sort(strenghts);
        int closestStrenght = calculateClosestStrenght(strenghts);
        //System.err.println(strenghts.toString());
        System.out.println(closestStrenght);
    }
    
    private static int calculateClosestStrenght(List<Integer> strenghts) {
        int closestStrenght = Integer.MAX_VALUE;
        
        for (int i=0; i < strenghts.size()-1; i++) {
            int strenght = Math.abs(strenghts.get(i) - strenghts.get(i+1));
            
            if (strenght < closestStrenght) {
                closestStrenght = strenght;
            }
        }
        
        return closestStrenght;
    }
}