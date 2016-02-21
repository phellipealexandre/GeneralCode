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
        String LON = in.next();
        String LAT = in.next();
        
        double userLat = parseDoubleString(LAT);
        double userLng = parseDoubleString(LON);
        
        int N = in.nextInt();
        in.nextLine();
        
        double shortestDistance = Double.MAX_VALUE;
        String shortestName = "";
        
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            //System.err.println(DEFIB);
            String[] splited = DEFIB.split(";");
            
            double defibrillatorLng = parseDoubleString(splited[4]);
            double defibrillatorLat = parseDoubleString(splited[5]);
            double distance = calculateDistance(userLat, userLng, defibrillatorLat, defibrillatorLng);
            //System.err.println("Distance: " + distance);
            
            if (distance < shortestDistance) {
                shortestDistance = distance;
                shortestName = splited[1];
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println(shortestName);
    }
    
    private static double parseDoubleString(String doubleStr) {
        return Double.parseDouble(doubleStr.replace(",","."));
    }
    
    private static double calculateDistance(double lat1, double lng1, double lat2, double lng2) {
        double x = (lng2 - lng1) * Math.cos((lat1 + lat2)/2);
        double y = lat2 - lat1;
        
        return Math.sqrt(x*x + y*y) * 6371;
    }
}