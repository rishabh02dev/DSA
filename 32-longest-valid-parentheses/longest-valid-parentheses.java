import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);  // Initialize the stack with -1 to handle the edge case for the first valid substring
        int maxi = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);  // Push the current index as the new base for future valid substrings
                } else {
                    maxi = Math.max(maxi, i - st.peek());
                }
            }
        }
        return maxi;
    }
}
