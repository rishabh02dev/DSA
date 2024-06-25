class Solution {

    static int findMax(int[] piles){
            int maxi = Integer.MIN_VALUE;
            int n = piles.length;
            for(int i=0; i<n;i++){
                maxi = Math.max(piles[i], maxi);
            }
            return maxi;
        }

        static int calculateTotalH(int[] piles, int hourly){
            int totalH = 0;
            int n = piles.length;

            for(int i=0; i<n; i++){
                totalH += Math.ceil((double)(piles[i])/(double)(hourly));
            }

            return totalH;
        }
        
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);

        while(low<=high){
            int mid = low + (high-low)/2;

            int totalH = calculateTotalH(piles, mid);

            if(totalH<=h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return low;
    }
}