class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int revNum  = 0;
        int ld = 0;
        while(x>0){
            ld = x%10;
            revNum = revNum*10+ld;
            x = x/10;
        }

        if(revNum==original){
            return true;
        }
        else{
            return false;
        }
    }
}