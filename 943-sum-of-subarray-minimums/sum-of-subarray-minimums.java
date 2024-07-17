class Solution {

    static int[] previousSmaller(int arr[]){

        int pse[] = new int[arr.length]; 

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = st.peek();
            }

            st.push(i);
        }

        return pse;
    }

    static int[] nextSmaller(int arr[]){

        int nse[] = new int[arr.length];
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nse[i] = n;
            }
            else{
                nse[i] = st.peek();
            }

            st.push(i);
        }

        return nse;

    }

    
    public int sumSubarrayMins(int[] arr) {
        long sum = 0;

        int mod = (int)1e9 + 7;

        int[] pse = previousSmaller(arr);
        int[] nse = nextSmaller(arr);

        for (int i = 0; i < arr.length; i++) {
            sum = (sum + (long) arr[i] * (i - pse[i]) * (nse[i] - i)) % mod;
        }

        return (int) sum;
    }
}