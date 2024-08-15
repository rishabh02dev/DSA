class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i=0; i<n;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
            else{
                two++;
            }
        }

        for(int i=0; i<zero;i++){
            arr[i] = 0;
        }
        for(int i=zero;i<zero+one;i++){
            arr[i] = 1;
        }
        for(int i=zero+one; i<n;i++){
            arr[i] = 2;
        }
    }
}


//now we are using the dutch flag algorithm

// int low = 0, mid = 0, high = n-1;
// while(mid<=high){
//     if(arr[mid]==0){
//         //swap(arr[mid],arr[low]);
//         left++;
//         mid++;
//     }
//     else if(arr[mid]==1){
//         mid++;
//     }
//     else{
//         swap(arr[mid],arr[high]);
//         high--;
//     }
// }