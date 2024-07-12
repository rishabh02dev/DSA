class Solution {

    int count(int n){
        int cnt  = 0;
        while(n>1){
            if(n%2==1){
                cnt++;
            }

            n = n/2;
        }

        if(n==1){
            cnt++;
        }

        return cnt;
    }
    public int[] countBits(int n) {
        
        int ans[] = new int[n+1];
        
        int i =0;
        while(i<=n){
            ans[i] = count(i);
            i++;
        }

        return ans;
    }
}