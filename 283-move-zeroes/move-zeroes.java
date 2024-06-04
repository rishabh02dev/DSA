class Solution {
    public void moveZeroes(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        
        int size = temp.size();
        
        for(int i =0; i<size;i++){
            arr[i] = temp.get(i);
        }
        
        for(int i= size;i<n;i++){
            arr[i] = 0;
        }
    }
}