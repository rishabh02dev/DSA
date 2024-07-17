class Solution {
    static long[] previousSmaller(long arr[]) {
        long[] pse = new long[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return pse;
    }

    // Function to calculate next smaller elements
    static long[] nextSmaller(long arr[]) {
        long[] nse = new long[arr.length];
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return nse;
    }

    // Function to calculate previous greater elements
    static long[] previousGreater(long arr[]) {
        long[] pge = new long[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return pge;
    }

    // Function to calculate next greater elements
    static long[] nextGreater(long arr[]) {
        long[] nge = new long[arr.length];
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return nge;
    }

    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sumMax = 0, sumMin = 0;

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        long[] pge = previousGreater(arr);
        long[] nge = nextGreater(arr);
        long[] pse = previousSmaller(arr);
        long[] nse = nextSmaller(arr);

        for (int i = 0; i < n; i++) {
            sumMax += arr[i] * (i - pge[i]) * (nge[i] - i);
            sumMin += arr[i] * (i - pse[i]) * (nse[i] - i);
        }

        return sumMax - sumMin;
    }
}