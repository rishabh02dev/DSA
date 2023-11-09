class Solution {

    public int majorityElement(int[] v) {
        //This is the burte force approach
        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];

        //This is the better approach
        // int n = v.length;
        // HashMap<Integer, Integer> mpp = new HashMap<>();

        // for (int i = 0; i < n; i++) {
        //     int value = mpp.getOrDefault(v[i], 0);
        //     mpp.put(v[i], value + 1);
        // }

        // //searching for the majority element:
        // for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
        //     if (it.getValue() > (n / 2)) {
        //         return it.getKey();
        //     }
        // }

        // return -1;

        //Now we will be looking for the Optimal Approach

        int cnt = 0;
        int el = v[0];
        for(int i =0 ; i<v.length; i++){
            if(cnt ==0){
                cnt =1;
                el = v[i];
            }
            else if(v[i] ==el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i=0; i<v.length; i++){
            if(v[i] == el)cnt1++;
        }
        if(cnt1>(v.length/2))
        {
            return el;
        }

        return -1;
    }
}
