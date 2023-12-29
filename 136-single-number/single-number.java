class Solution {
    public int singleNumber(int[] arr) {
         int xor = 0;
        for(int i=0; i<arr.length; i++){
            xor = xor^arr[i];
        }
        return xor;
    }
}