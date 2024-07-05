
class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        Set<Integer> st = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            st.add(arr[i]);
        }

        int index = 0;
        for (int num : st) {
            arr[index++] = num;
        }

        return st.size();
    }
}
