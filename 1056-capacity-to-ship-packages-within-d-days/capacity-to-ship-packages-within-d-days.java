class Solution {
    static int noOfDays(int arr[], int value){
        int day = 1;
        int load = 0;

        for(int i=0; i<arr.length; i++){
            if(load+ arr[i]>value){
                day +=1;
                load = arr[i];
            }else{
                load +=arr[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        int mini = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++){
            mini = Math.max(mini, arr[i]);
            sum +=arr[i];
        }

        int low = mini;
        int high = sum;

        while(low<=high){
            int mid = low  + (high-low)/2;
            int numberOfDays = noOfDays(arr, mid);
            if(numberOfDays<=days){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}