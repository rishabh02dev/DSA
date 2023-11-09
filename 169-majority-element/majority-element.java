class Solution {

    public int majorityElement(int[] v) {
        //This is the burte force approach
        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];

        //This is the better approach
        int n = v.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }

        return -1;
    }
}
