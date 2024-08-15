class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;

        int notes_5 = 0;
        int notes_10 = 0;
        for(int i=0; i<n;i++){
            if(bills[i]==5){
                notes_5++;
            }
            else if(bills[i]==10){
                if(notes_5>0){
                    notes_5--;
                    notes_10++;
                }else{
                    return false;
                }
            }
            else{
                if(notes_5>0 && notes_10>0){
                    notes_5--;
                    notes_10--;
                }else if(notes_5>=3){
                    notes_5 = notes_5-3;
                }else{
                    return false;
                }
            }
        }

        return true;
    }
}