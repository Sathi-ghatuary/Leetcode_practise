public class Move_zeroes{
    public void move_zeroes(int nums[]){
        int temp[]=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp[index++]=nums[i];
            }
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }
}