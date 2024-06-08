class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int presum = 0;
        int cnt = 0;

        //intially taking presum as 0 and cnt as 1
        mpp.put(0,1);
        for(int i=0; i<n;i++){
            presum+=arr[i];

            int remove = presum - k;

            if(mpp.containsKey(remove)){
                cnt+= mpp.get(remove);
            }

            mpp.put(presum, mpp.getOrDefault(presum, 0) + 1);
            
        }

        return cnt;

    }
}