class Solution {

    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;

        for (int i = 0; i < position.length; i++) {
            int p = position[i];
            if (p % 2 == 0) even++; else odd++;
        }

        return Math.min(even, odd);
    }
}
