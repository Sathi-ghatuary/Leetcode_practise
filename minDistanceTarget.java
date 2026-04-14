class minDistanceTarget{
    public int minDistance(int start,int target ,int nums[]){
        int n=nums.length;
        for(int d=0;d<n;d++){
            if(start-d>=0 && nums[start-d]==target){
                return d;
            }
            if(start+d<=n&&nums[start+d]==target){
                return d;
            }
        }
        return -1;
    }
}