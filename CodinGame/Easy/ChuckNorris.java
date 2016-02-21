import java.util.*;
import java.io.*;
import java.math.*;
import java.nio.ByteBuffer;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String mESSAGE = in.nextLine();

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        String strEncoded = "";
        String strByte = "";
        for (char c : mESSAGE.toCharArray()) {
            strByte += getBinaryByLetter(c);
        }
        
        System.err.println(strByte);
        System.out.println(encode(strByte));
    }
    
    private static String getBinaryByLetter(char c) {
        int ascii = (int) c;
        return String.format("%07d", new BigInteger(Integer.toBinaryString(ascii)));
    }
    
    private static String encode(String binary) {
        boolean isSame = false;
        char currentBit = binary.charAt(0) == '0' ? '0': '1';
        int count = 0;
        String encodedStr = "";
        
        for (char c : binary.toCharArray()) {
            if (currentBit == c) {
                count++;
            } else {
                encodedStr += generateBits(currentBit, count) + " ";
                currentBit = c;
                count = 1;
            }
        }
        encodedStr += generateBits(currentBit, count);
        
        
        return encodedStr;
    }
    
    private static String generateBits(char bit, int times) {
        String bits = bit == '0'? "00 " : "0 ";
        for (int i = 0; i < times; i++) {
            bits += "0";
        }
        
        return bits;
    }
}