class Solution {
    public int uniquePaths(int m, int n) {
        long totalSteps = (long) m + n - 2;
        long moves = n - 1;
        long result = 1;
        for (long i = 1; i <= moves; i++) {
            result = result * (totalSteps - moves + i) / i;
        }
        return (int) result;
    }
}