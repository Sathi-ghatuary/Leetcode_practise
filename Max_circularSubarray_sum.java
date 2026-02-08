public class Max_circularSubarray_sum {
    public int max_circular_subarray(int arr[]){
        int totalSum=0;
        int minsum=Kadane_min(arr);
        int maxsum=kadane_max(arr);
        for(int x:arr){
            totalSum+=x;

        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,totalSum-minsum);
    }
    private int kadane_max(int arr[]){
        int curr=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            curr=Math.max(arr[i],curr+arr[i]);
            max=Math.max(max,curr);

        }
        return max;
    }
     private int Kadane_min(int arr[]){
        int curr=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            curr=Math.min(arr[i],curr+arr[i]);
            min=Math.min(min,curr);

        }
        return min;
}
}
