
class Solution {
    public int removeDuplicates(int[] arr) {
        
        Set<Integer> st = new LinkedHashSet<>();

        for(int i=0; i<arr.length;i++){
            st.add(arr[i]);
        }

        int j = 0;
        for(int x : st){
            arr[j] = x;
            j++;
        }

        return st.size();
    }
}
