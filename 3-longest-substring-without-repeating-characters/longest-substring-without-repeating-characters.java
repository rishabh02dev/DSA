class Solution {
    public int lengthOfLongestSubstring(String S) {
         int n = S.length();
        int maxLength = 0;
        Set<Character>  charSet = new HashSet<>();
        
        int left = 0;
        for(int right = 0; right<n; right++){
            if(!charSet.contains(S.charAt(right))){
                charSet.add(S.charAt(right));
                maxLength = Math.max(maxLength,right - left+1);
            }else{
                while(charSet.contains(S.charAt(right))){
                    charSet.remove(S.charAt(left));
                    left++;
                }
            }
            charSet.add(S.charAt(right));
        }
        return maxLength;
    }
}