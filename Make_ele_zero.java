import java.util.Arrays;

public class Make_ele_zero{
    public int Select_ele(int nums[]){
        int n=nums.length;
        int left=0,count=0;
        int right=Arrays.stream(nums).sum();
        
        for(int i=0;i<n;i++){
             left += nums[i];
            right-=nums[i];
            if(nums[i]!=0) continue;
            if(left==right) count+=2;
            if(Math.abs(left-right)==1) count++;
        }
        return count;
    }
}