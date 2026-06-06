class Max_Zeroone_diff {
    int maxSubstring(String s) {
        // code here
        int maxsum=-1;
        int currsum=0;
        for(int i=0;i<s.length();i++){
            int val=(s.charAt(i)=='0')?1:-1;
            
            currsum +=val;
            maxsum=Math.max(currsum,maxsum);
            
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
}
