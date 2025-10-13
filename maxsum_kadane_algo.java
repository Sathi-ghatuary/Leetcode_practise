public class maxsum_kadane_algo {
    //brute_force
    public int maxsum_brute(int nums[]){
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+j;
                max=Math.max(sum,max);

            }
        }return max;
    }
    //optimize o(n)
    public int maxsub(int nums[]){
        int n=nums.length;
        int maxsum=nums[0],currsum=nums[0];
        for(int i=0;i<n;i++){
              currsum=Math.max(nums[i],currsum+nums[i]);
              maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }

}
