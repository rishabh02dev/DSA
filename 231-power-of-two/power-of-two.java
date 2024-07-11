class Solution {
    public boolean isPowerOfTwo(int n) {
         if (n <= 0) {
            return false;
        }
        int count = 0;
        int originalN = n;

        while (n > 1) {
            n = n / 2;
            count++;
        }

        return originalN == Math.pow(2, count);
    }
}