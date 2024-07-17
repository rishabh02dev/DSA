class Solution {

    static boolean ValidPalin(String ans) {
        char[] ch = ans.toCharArray();
        int i = 0;
        int j = ans.length() - 1;
        while (i < j) {
            if (ch[i] == ch[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] ch = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetterOrDigit(ch[i])) {
                sb.append(ch[i]);
            }
        }

        String ans = sb.toString();
        return ValidPalin(ans);
    }
}