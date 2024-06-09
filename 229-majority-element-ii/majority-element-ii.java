class Solution {
    public List<Integer> majorityElement(int[] v) {
        List<Integer> ls  = new ArrayList<>();
        int n = v.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        int min = (int)(n/3) + 1;

        for(int i=0; i<n; i++){
            int value = mpp.getOrDefault(v[i],0);
            mpp.put(v[i] , value+1);


            if(mpp.get(v[i])==min){
                ls.add(v[i]);
            }
            if(ls.size()==2){
                break;
            }
        }

        return ls;
    }
}