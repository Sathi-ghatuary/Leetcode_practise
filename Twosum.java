import java.util.HashMap;

public class Twosum {
    //start with brute force o(n^2)
 public int[] twosumBrute(int nums[],int target){
       int n =nums.length;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
       }return new int[]{-1,-1};
 }
//optimise o(n)
 public int[] twosum(int nums[],int target){
    int n=nums.length;
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<n;i++){
        int compliment=target-nums[i];
        if(map.containsKey(compliment)){
            return new int[]{compliment,i};
        }map.put(nums[i],i);
    }
    return new int[]{-1,-1};
 }
    
}