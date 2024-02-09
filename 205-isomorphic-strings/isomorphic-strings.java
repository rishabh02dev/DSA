class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp1 = new HashMap<>();
        HashMap<Character, Boolean> mp2 = new HashMap<>();

        int n = s.length();
        for(int i=0; i<n; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            //ab agar same milega mp1 toh
            if(mp1.containsKey(ch1)){
                if(mp1.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                if(mp2.containsKey(ch2)==true){
                    return false;
                }
                else{
                    mp1.put(ch1,ch2);
                    mp2.put(ch2, true);
                }
            }
           
        }

        return true;

    }
}