class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Get the lengths of both arrays
        int m = nums1.length;
        int n = nums2.length;
        
        // Create a new array to hold all elements from both arrays
        int[] jk = new int[m + n];
        int j = 0;
        
        // Copy all elements from the first array
        for(int i = 0; i < m; i++) {
            jk[j] = nums1[i];
            j++;
        }
        
        // Copy all elements from the second array
        for(int a = 0; a < n; a++) {
            jk[j] = nums2[a];
            j++;
        }
        
        // Sort the combined array
        Arrays.sort(jk);
        
        // If the total length is odd, return middle element
        if((m + n) % 2 == 1) {
            int s = (m + n) / 2;
            return jk[s];
        }
        // If the total length is even, return average of the two middle elements
        else {
            int t = (m + n) / 2;
            int s = jk[t] + jk[t - 1];
            return s / 2.0;
        }
    }
}