class Solution {
    public int minBitFlips(int A, int B) {
        int xor = 0;
        int count = 0;
        xor = xor^A^B;
        while(xor!=0){
            xor = (xor&(xor-1));
            count++;
        }
        return count;
    }
}