class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (nums[(i + j) % n] > nums[i]) {
                    result[i] = nums[(i + j) % n];
                    break; 
                }
            }
        }
        
        return result;
    }
}
