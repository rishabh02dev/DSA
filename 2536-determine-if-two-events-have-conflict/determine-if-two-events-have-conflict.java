// if s1 > s2, it returns positive number
// if s1 < s2, it returns negative number
// if s1 == s2, it returns 0

class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
      int c1 = event2[0].compareTo(event1[1]);
      int c2 = event2[1].compareTo(event1[0]);
      return (c1 <= 0) && (c2 >= 0);  
    }
}