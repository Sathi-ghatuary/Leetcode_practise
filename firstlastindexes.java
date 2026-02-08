public class firstlastindexes {
   class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
    public pair indexes(long v[], long x) {
        int n = v.length;
        int first = -1, last = -1;

        // Find first occurrence
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (v[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (v[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Find last occurrence
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (v[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (v[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new pair(first, last);
    }


}
