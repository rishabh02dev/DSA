class Solution {
      public int minDays(int[] bloomDay, int m, int k) {
        long val=(long)m*k;
        if( val > bloomDay.length) return -1;

        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }

        while(low<=high){
            int mid=(low+high)/2;

            if(possibleDays(bloomDay,m,k,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
           
        }
        return low;


    }

    public boolean possibleDays(int[] bloomDay, int m, int k,int mid){
        
        int totalBouquet=0;
        int window=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                window++;
            }
            else{
                totalBouquet+=(window/k);
                window=0;

            }
        }

        totalBouquet+=(window/k);
        return totalBouquet>=m;

    }
}