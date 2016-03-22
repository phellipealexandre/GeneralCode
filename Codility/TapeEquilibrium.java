class Solution {
    public int solution(int[] A) { 
        
        int arrayTotalSum = 0, arrayTempSum = 0; 
        int minValue = Integer.MAX_VALUE; 
        for (int i=0; i<A.length; i++) {
            arrayTotalSum += A[i];
        } 
        
        for (int p=1; p<A.length; p++){
            arrayTempSum += A[p-1];
            int equilibrium = Math.abs(arrayTempSum - (arrayTotalSum-arrayTempSum));
            
            if(equilibrium < minValue) {
                minValue = equilibrium; 
            } 
        } 
        
        return minValue; 
    }
}