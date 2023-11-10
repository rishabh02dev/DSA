class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest = 0;
        int count = 0;
        int last_smaller = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]-1 == last_smaller){
                count = count+1;
                last_smaller = nums[i];
            }
            else if(nums[i] != last_smaller){
                count = 1;
                last_smaller = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}