class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[] = new int[26];

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }

        int count =0;
        for(int i=0; i<26;i++){
            if(arr[i]!=0){
                count = arr[i];
                break;
            }
        }

        for(int i=0; i<26;i++){
            if(arr[i]!=0 && arr[i]!=count){
                return false;
            }
        }

        return true;
        
    }
}