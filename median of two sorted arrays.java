class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len_1 = nums1.length;
        int len_2 = nums2.length;
        int[] combine = new int [len_1 + len_2];
        int j = 0;
        int k = 0;
        int len_c = len_1 + len_2;
        
        for (int i = 0; i < len_c; i++) {
        // if both "a" and "b" have elements left to check
            if (j < nums1.length && k < nums2.length) {
                // check if "b" has a smaller element
                if (nums2[k] < nums1[j]) {
                    // if so add it to "c"
                    combine[i] = nums2[k];
                    k++;
                }
                // if "a" has a smaller element
                else {
                    // add it to "c"
                    combine[i] = nums1[j];
                    j++;
                }       
            }
            // if there are no more elements to check in "a"
            // but there are still elements to check in "b"
            else if (k < nums2.length) {
                // add those elements in "b" to "c"
                combine[i] = nums2[k];
                k++;
            }
            // if there are no more elements to check in "b"
            // but there are still elements to check in "a"
            else {
                // add those elements in "a" to "c"
                combine[i] = nums1[j];
                j++;
            }
        }
        
        
        if (len_c % 2 != 0) 
        return (double)combine[len_c / 2]; 
      
        return (double)(combine[(len_c - 1) / 2] + combine[len_c / 2]) / 2.0; 
    }
}