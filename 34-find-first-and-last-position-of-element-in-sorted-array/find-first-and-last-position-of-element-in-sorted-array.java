class Solution {

    static int firstOccurence(int arr[], int target){
        int n = arr.length;
        int first  = -1;
        int low= 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+ (high-low)/2);

            if(arr[mid]==target){
                first = mid;
                high = mid-1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return first;
    }



    static int lastOccurence(int arr[], int target){
        int n = arr.length;
        int last  = -1;
        int low= 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+ (high-low)/2);

            if(arr[mid]==target){
                last = mid;
                low= mid+1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] arr, int target) {
        
        int ans[] = new int[2];
        ans[0] = firstOccurence(arr, target);
        ans[1] = lastOccurence(arr, target);
        return ans;
    }
}



//This is the most brute form for solving this question
// int first = -1;
//         int last = -1;
//         for(int i=0; i<nums.length;i++){
//             if(nums[i]==target){
//                 if(first==-1){
//                     first = i;
//                 }
//                 last = i;
//             }
//         }

//         int ans[] = new int[2];
//         ans[0] = first;
//         ans[1] = last;
//         return ans;