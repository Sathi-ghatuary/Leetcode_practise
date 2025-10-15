class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        int inx=1,preinx=0,res=0;
        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)){
                inx++;
            }else{
                preinx=inx;
                inx=1;
            }
            int half=inx>>1;
            int min=preinx<inx?preinx:inx;
            int candidate=half>min?half:min;
            if(candidate>res) res=candidate;

        }return res;
    }
}