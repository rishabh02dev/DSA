class Solution {

    static int numSubarray(int[] nums, int k){
        int left = 0;
        int right = 0;
        int count = 0;
        int sum = 0;
        while(right<nums.length){
            sum = sum + nums[right]%2;
            while(sum>k && left<=right){
                sum = sum - nums[left]%2;
                left++;
            }
            count = count + (right-left+1);
            right++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        
        int ans1 = numSubarray(nums,k);
        int ans2 = numSubarray(nums,k-1);

        return ans1-ans2;
    }
}