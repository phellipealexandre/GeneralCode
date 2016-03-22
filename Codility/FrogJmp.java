class Solution {
    public int solution(int X, int Y, int D) {
        double requiredJumps = (Y-X)/(double)D;
        return (int) Math.ceil(requiredJumps);
    }
}