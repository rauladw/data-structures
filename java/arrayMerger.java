// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
// The number of elements initialized in nums1 and nums2 are m and n respectively. 
// You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.

// Time: O(n)
// Space: O(1)

public class ArrayMerger {
    // while loop implementation
    public void mergeWhile(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
    }

    // for loop implementation
    public void mergeFor(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;

        for (int k = m + n - 1; k >= 0; k--) {
            if (j < 0)
                break;
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k] = nums1[i--];
            else
                nums1[k] = nums2[j--];
        }
    }
}
