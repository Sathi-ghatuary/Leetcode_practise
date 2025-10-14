public class RotateArray {
    //Tc:O(n*k)
    public void rotate_ARR(int nums[],int k){
        k%=nums.length;
        for(int i=0;i<k;i++){
            int last=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=last;
        }
    }
    public void rotate_ARR_optimize(int nums[],int k){
      k%=nums.length;
      reverse(nums,0,nums.length-1);
      reverse(nums,0,k-1);
      reverse(nums,k,nums.length-1);
    }
      private void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
      }
    }

