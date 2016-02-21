import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String TEMPS = in.nextLine(); // the N temperatures expressed as integers ranging from -273 to 5526
        String[] split = TEMPS.split(" ");
        int result = 0;

        if (N != 0) {
            result = 5527;
            
            for (int i = 0; i < N; i++) {
                int temp = Integer.parseInt(split[i]);
                
                boolean negativeNextToZero = temp < 0 && mod(temp) < mod(result);
                boolean positiveNextToZero = temp > 0 && temp <= mod(result);
                
                if (negativeNextToZero || positiveNextToZero) {
                    result = temp;
                }
            }    
        }
        
        System.out.println(result);
    }
    
    private static int mod(int x) {
        if (x < 0) {
            x *= -1;
        }
        
        return x;
    } 
}