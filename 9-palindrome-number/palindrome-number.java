class Solution {
    public boolean isPalindrome(int x) {
        // If the number is negative or if it's a multiple of 10 and not 0, it's not a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        
        // Reverse the second half of the number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // If the number is a palindrome, either the full number is the same when reversed,
        // or it's a palindrome with an odd number of digits (ignore the middle digit).
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
