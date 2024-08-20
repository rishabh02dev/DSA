class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int count = 0;
        int starting = -1;
        int arr[] = new int[128]; // ASCII array to keep track of characters

        // Fill the array with the frequency of characters in t
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i)]++;
        }

        while (right < s.length()) {
            char ch = s.charAt(right);
            
            if (arr[ch] > 0) {
                count++;
            }
            
            arr[ch]--;
            
            
            while (count == t.length()) {
               
                if ((right - left + 1) < minLength) {
                    minLength = right - left + 1;
                    starting = left;
                }

                char leftChar = s.charAt(left);
                arr[leftChar]++;
                
                
                if (arr[leftChar] > 0) {
                    count--;
                }
                
                left++;
            }

            right++;
        }

        return (starting == -1) ? "" : s.substring(starting, starting + minLength);
    }
}
