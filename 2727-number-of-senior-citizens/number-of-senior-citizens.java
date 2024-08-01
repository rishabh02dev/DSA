class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for (int i = 0; i < details.length; i++) {
            String res = details[i];
            
            // Assuming age is at index 11 and 12 based on previous logic
            int age = Integer.parseInt(res.substring(11, 13));
            
            if (age > 60) { // Checking if age is greater than 60
                ans++;
            }
        }
        return ans;
    }
}
