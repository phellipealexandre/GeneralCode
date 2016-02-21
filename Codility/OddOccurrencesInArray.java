class Solution {
    
    public int solution(int[] A) {
        int oddElement = 0;
        
        for(int i=0; i<A.length; i++) {
            oddElement ^= A[i];
        }
        
        return oddElement;
    }
}