class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {

        int maxi = 0;
        int count = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                count++;
                maxi = Math.max(count,maxi);
            }
            else{
                count = 0;
            }
        }
        return maxi;
    }
}