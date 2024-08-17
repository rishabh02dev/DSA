class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int leftsum = 0;
        int rightsum = 0;
        int maxsum = 0;
        for(int i=0; i<=k-1;i++){
            leftsum = leftsum + cardPoints[i];
        }

        maxsum = leftsum;

        int rightindex = cardPoints.length-1;

        for(int i=k-1;i>=0;i--){
            leftsum = leftsum - cardPoints[i];
            rightsum = rightsum + cardPoints[rightindex];
            rightindex--;
            maxsum = Math.max(maxsum, leftsum+rightsum);
        }

        return maxsum;

      
    }
}