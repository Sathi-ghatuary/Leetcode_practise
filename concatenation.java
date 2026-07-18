class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int N=2*n;
        int[] res=new int[N];
        for(int i=0;i<N;i++){
            if(i<n){
                res[i] = nums[i];

            }
            if(i>=n){
                res[i] = nums[i-n];
            }
        }
        return res;
    }
}