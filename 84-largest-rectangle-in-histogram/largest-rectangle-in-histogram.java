class Solution {

    private int[] nextSmallerElement(int[] arr, int n){
        Stack<Integer> st = new Stack<>();
        st.push(-1);

        int[] ans = new int[n];
        for(int i = n-1; i>=0; i--){
            int curr = arr[i];
            while(st.peek()!= -1 && arr[st.peek()]>=curr){
                st.pop();
            }
            ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }

    private int[] prevSmallerElement(int[] arr, int n){
        Stack<Integer> st = new Stack<>();
        st.push(-1);

        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            int curr = arr[i];
            while(st.peek()!= -1 && arr[st.peek()]>=curr){
                st.pop();
            }
            ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }


    
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer>  st =  new Stack<>();
        int[] next =  nextSmallerElement(arr, n);
        int[] prev =  prevSmallerElement(arr,n);

        int area = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int l = arr[i];

            if(next[i]==-1){
                next[i] =n;
            }
            int b  = next[i] - prev[i] -1;
            int newArea = l*b;
            area = Math.max(area, newArea);
        }
        return area;
    }
}