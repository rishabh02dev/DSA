class Solution {
    public int maxDistance(int[] stalls, int k) {
        int n = stalls.length;
        Arrays.sort(stalls);
        int low =1;
        int high = stalls[n-1] - stalls[0];
        while(low<=high){
            int mid = (low+high)/2;
            if(canWePlace(stalls,mid,k)==true){
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return high;
    }
    public static boolean canWePlace(int[] stalls, int dist, int cows){
        int n = stalls.length;
        int cntcows = 1;
        int last = stalls[0];
        for(int i=1; i<n; i++){
            if(stalls[i]-last>=dist){
                cntcows++;
                last = stalls[i];
            }
            if(cntcows>=cows) return true;
        }
        return false;
    }
}