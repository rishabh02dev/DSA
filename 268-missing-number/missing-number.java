class Solution {

    public int missingNumber(int[] arr) {
        int N = arr.length;
        int sum = (N * (N + 1)) / 2;
        int s2 = 0;

        for (int i = 0; i < N; i++) {
            s2 += arr[i];
        }

        int missingNum = sum - s2;
        return missingNum;
    }
}
