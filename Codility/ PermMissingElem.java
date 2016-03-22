class Solution {
    public int solution(int[] A) {
        long N = A.length + 1;
        long totalSum = (N + 1) * (N)/2; //arithmetic progression sum
        long arraySum = 0L;
        
        for (int i=0; i<A.length;i++) {
            arraySum += A[i];
        }
        
        return (int)(totalSum - arraySum);
    }
}