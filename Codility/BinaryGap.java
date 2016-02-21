class Solution {
    public int solution(int N) {
        int maxGap = 0;
        int currentGap = 0;
        
        while (N>0 && N%2==0) {
            N = N >> 1;
        }
        
        boolean startCountingGap = false;
        
        while (N>0) {
            if (N%2 == 0) {
                currentGap++;
                if (currentGap > maxGap) {
                    maxGap = currentGap;
                }
            } else {
                currentGap = 0;
            }
            
            N = N >> 1;
        }
        
        
        return maxGap;
    }
}