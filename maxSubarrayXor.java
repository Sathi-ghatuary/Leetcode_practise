public class maxSubarrayXor {
    
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
       
        int n = arr.length;

        // Step 1: XOR of first window
        int windowXor = 0;
        for (int i = 0; i < k; i++) {
            windowXor ^= arr[i];
        }

        int maxXor = windowXor;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            // Remove previous element
            windowXor ^= arr[i - k];

            // Add new element
            windowXor ^= arr[i];

            // Update maximum
            maxXor = Math.max(maxXor, windowXor);
        }

        return maxXor;
   

    }


}
