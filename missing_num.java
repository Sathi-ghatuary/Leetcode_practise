public class missing_num {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        long expectsum=(long)n*(n+1)/2;
        long actualsum=0;
        for(int num:arr){
            actualsum+=num;
        }
        return (int)(expectsum-actualsum);
    }
}
