class Solution {

    public void nextPermutation(int[] A) {
        int n = A.length;

        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
              
                ind = i;
                break;
            }
        }

       
        if (ind != -1) {
            for (int i = n - 1; i >= ind; i--) {
                if (A[i] > A[ind]) {
                    int tmp = A[i];
                    A[i] = A[ind];
                    A[ind] = tmp;
                    break;
                }
            }
        }

       
        reverse(A, ind + 1, n - 1);

    }

    private static void reverse(int[] A, int start, int end) {
        while (start < end) {
            int tmp = A[start];
            A[start] = A[end];
            A[end] = tmp;
            start++;
            end--;
        }
    }
}