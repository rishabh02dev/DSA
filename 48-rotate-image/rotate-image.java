class Solution {

    static void reverse(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[][] arr) {
        
        int n = arr.length;
        //sbase phle hm transpose karengee
        for(int i=0; i<n-1;i++){
            for(int j= i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //uppar tak transponse khatam kardiya hmne ab baari hai reverse karne

        for(int i=0;i<n;i++){
            reverse(arr[i]);
        }
    }
}