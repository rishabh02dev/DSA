class Solution {
    public int longestOnes(int[] nums, int k) {
        int left  = 0;
        int right = 0;
        int maxLength = 0;
        int len = 0;
        int zeroes = 0;
        while(right<nums.length){

            if(nums[right]==0){
                zeroes++;
            }

            if(zeroes>k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }

            if(zeroes<=k){
                len = right-left+1;
                maxLength = Math.max(maxLength, len);
            }

            right++;
        }

        return maxLength;
    }
}