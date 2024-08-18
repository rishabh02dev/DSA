class Solution {
    public int numberOfSubstrings(String s) {
        int lastSeen[] = new int[3];
        for(int i=0; i<lastSeen.length;i++){
            lastSeen[i] = -1;
        }

        int count  = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            lastSeen[ch-'a'] = i;
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1){
                 count += 1 + Math.min(Math.min(lastSeen[0], lastSeen[1]), lastSeen[2]);
            }
        }

        return count;

    }
}