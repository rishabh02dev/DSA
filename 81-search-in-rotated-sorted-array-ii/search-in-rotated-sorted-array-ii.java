class Solution {
    public boolean search(int[] arr, int target) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}