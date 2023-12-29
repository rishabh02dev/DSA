class Solution {
    public int xorOperation(int n, int start) {
        // if(n==0){
        //     return 0;
        // }

        // int arr[] = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = start + 2*i;
        // }

        // int ans = 0;
        // for(int i=0; i<n; i++){
        //     ans = ans^arr[i];
        // }
        // return ans;

        int count =0;
        for(int i=0; i<n; i++){
            count = count^ start + i*2;
        }
        return count;
     }
}