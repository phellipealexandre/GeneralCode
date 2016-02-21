import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    
    private static HashMap<String, String> table;

    public static void main(String args[]) {
        
        table = new HashMap<String, String>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        in.nextLine();
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        in.nextLine();
        
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            table.put(EXT.toUpperCase(), MT);
            System.err.println("Table: " + EXT.toUpperCase() + " - " + MT);
            
            in.nextLine();
        }
        
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            System.err.println("FNAME: " + FNAME);
            String[] fileDivision = FNAME.split("\\.");
            
            String extension = fileDivision.length > 1 ? 
                fileDivision[fileDivision.length-1].toUpperCase() :
                "UNKNOWN";
                
            System.err.println("extension: " + extension);
            
            if (table.containsKey(extension) && !FNAME.endsWith(".")) {
                System.out.println(table.get(extension));
            } else {
                System.out.println("UNKNOWN");
            }
        }
    }
}