class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hash=new HashMap<>();
        int res=0;
        int majority=0;
        for(int n:nums){
            hash.put(n,hash.getOrDefault(n,0)+1);
            if(hash.get(n)>majority){
                res=n;
                majority=hash.get(n);
            }
        }
        return res;
    }
}