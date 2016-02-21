class Solution {
    public int[] solution(int[] A, int K) {
        
        int rotations = (A.length == 0 || K == 0) ? 0 : K % A.length;
        
        for (int i=0; i<rotations; i++) {
            A = rotate(A);
        }

        return A;
    }
    
    private int[] rotate(int[] A) {
        int lastElement = A[A.length-1];
        
        for (int i=A.length-1; i>0; i--) {
            A[i] = A[i-1];
        }
        
        A[0] = lastElement;
        return A;
    }
}