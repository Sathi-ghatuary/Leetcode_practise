public class Min_window {
     public String minWindow(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        int i = 0;
        while (i < n) {
            int j = 0;

            // ✅ FIXED forward scan
            while (i < n && j < m) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    j++;
                }
                i++;
            }

            if (j < m) break;

            // Backward shrink
            int end = i - 1;
            j = m - 1;

            while (j >= 0) {
                if (s1.charAt(i - 1) == s2.charAt(j)) {
                    j--;
                }
                i--;
            }

            int start = i;

            if (end - start + 1 < minLen) {
                minLen = end - start + 1;
                startIndex = start;
            }

            i = start + 1; // reset
        }

        return startIndex == -1 ? "" :
               s1.substring(startIndex, startIndex + minLen);
    }

}
