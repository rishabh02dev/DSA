class Solution {
    public boolean isAnagram(String s, String t) {
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(t1);

           String sorted1 = new String(s1);
           String sorted2 = new String(t1);

            return sorted1.equals(sorted2);
        }
}