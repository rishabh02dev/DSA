class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length){
            return false;
        }
        HashMap<Integer, Integer> mpp = new HashMap<>();
        //firstly we put x and its frequency in the map
        for(int x : target){
            mpp.put(x, mpp.getOrDefault(x,0)+1);
        }


        for(int x : arr){
            if(!mpp.containsKey(x) || mpp.get(x)==0){
                return false;
            }
            mpp.put(x, mpp.get(x)-1);
        }

        int count  = 0;
        for(int x: mpp.values()){
            if(count!=0){
                return false;
            }
        }

        return true;
    }
}