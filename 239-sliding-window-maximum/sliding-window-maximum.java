class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        if (n == 0) return new int[0];
        int[] ans = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            // Remove indices of elements not in the current sliding window
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
            
            // Remove indices of all elements smaller than the current element
            while (!deque.isEmpty() && a[deque.peekLast()] <= a[i]) {
                deque.pollLast();
            }
            
            deque.offerLast(i);
            
            // Add the current maximum to the answer array
            if (i >= k - 1) {
                ans[i - k + 1] = a[deque.peekFirst()];
            }
        }
        
        return ans;
    }
}