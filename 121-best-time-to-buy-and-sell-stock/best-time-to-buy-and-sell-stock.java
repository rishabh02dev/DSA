class Solution {
    public int maxProfit(int[] a) {
        int min = a[0];
        int profit =0;
        for(int i =1 ; i<a.length; i++){
            int cost = a[i] - min;
            profit = Math.max(profit , cost);
            min = Math.min(min, a[i]);
        }

        return profit;
    }
}