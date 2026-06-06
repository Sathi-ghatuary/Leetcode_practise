class sumdiff {
    public int[] leftRightDifference(int[] nums) {
        int rightsum=0;
        for(int num:nums){
            rightsum+=num;
        }
        int leftsum=0;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            rightsum-=nums[i];
            res[i]=Math.abs(leftsum-rightsum);
            leftsum+=nums[i];
        }
        return res;
    }
}