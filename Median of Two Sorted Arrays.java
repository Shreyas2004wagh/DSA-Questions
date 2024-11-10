class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m + n];

        for (int i = 0; i < m; i++) {
            mergedArray[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            mergedArray[m + i] = nums2[i];
        }

        Arrays.sort(mergedArray);

        if ((m + n) % 2 == 1) {
            return mergedArray[(m + n) / 2];
        } else {
            int mid1 = (m + n) / 2;
            int mid2 = mid1 - 1;
            return (mergedArray[mid1] + mergedArray[mid2]) / 2.0;
        }
    }
}