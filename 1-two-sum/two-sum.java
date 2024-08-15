class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int num[] = new int[2];
        int n = nums.length;
        for(int i=0;i<n;i++){
            int num1 = nums[i];
            int diff = target - num1;
            if(mpp.containsKey(diff)){
                num[0] = mpp.get(diff);
                num[1] = i;
                return num;
            }
            mpp.put(num1,i);
        }

        return num;
    }
}