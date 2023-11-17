import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                // Check for duplicates before adding to the result
                if (ans.isEmpty() || ans.get(ans.size() - 1) != nums1[i]) {
                    ans.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        // Convert ArrayList to array
        int[] result = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }

        return result;
    }
}
