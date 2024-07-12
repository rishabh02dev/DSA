class Solution {
    public int singleNumber(int[] arr) {
       HashMap<Integer,Integer> mpp = new HashMap<>();
        int ans = 0;
       for(int num:arr){
            mpp.put(num, mpp.getOrDefault(num,0)+1);
       }

       for(int key:mpp.keySet()){
         if(mpp.get(key)%2==1){
             ans = key;
         }
       }

       return ans;
    }
}