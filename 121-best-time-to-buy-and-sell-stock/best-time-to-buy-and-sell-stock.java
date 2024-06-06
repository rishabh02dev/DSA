class Solution {
    public int maxProfit(int[] arr) {
          int low = arr[0];
          int profit = 0;
        for(int i=1; i<arr.length ;i++){
            int price = arr[i] - low;
            low = Math.min(arr[i], low);
            profit = Math.max(profit, price);
        }

        return profit;
    }
}