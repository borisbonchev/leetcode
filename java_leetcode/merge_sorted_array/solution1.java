package merge_sorted_array;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1_index = m - 1;
        int nums2_index = n - 1;
        int mergednums1_index = m + n - 1; // Merged array index

        // Iterate till one of the arrays is empty
        while (nums1_index >= 0 && nums2_index >= 0) {
            if (nums1[nums1_index] > nums2[nums2_index]) {
                nums1[mergednums1_index] = nums1[nums1_index];
                nums1_index--;
            } else {
                nums1[mergednums1_index] = nums2[nums2_index];
                nums2_index--;
            }
            mergednums1_index--;
        }

        // Copy remaining elements of nums2 to nums1
        while (nums2_index >= 0) {
            nums1[mergednums1_index] = nums2[nums2_index];
            nums2_index--;
            mergednums1_index--;
        }
    }
}
