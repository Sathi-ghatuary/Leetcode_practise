class Solution {
    public int[] shuffle(int[] nums, int n) {
        int N=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int[] res=new int[N];
        for(int i=0;i<n;i++){
            arr1[i]=nums[i];
            arr2[i]=nums[i+n];
        }
        for(int i=0;i<n;i++){
            res[2*i]=arr1[i];
            res[2*i+1]=arr2[i];
        }
        return res;
    }
}