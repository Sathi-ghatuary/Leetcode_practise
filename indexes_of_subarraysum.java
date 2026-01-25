public class indexes_of_subarraysum {
    
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer>result=new ArrayList<>();
        int left=0;
        long currsum=0;
        for(int right=0;right<arr.length;right++){
            currsum+=arr[right];
            //shrink window if sum exceed target
            while(currsum>target&&left<=right){
                currsum-=arr[left];
                left++;
           }
           if(currsum==target){
               result.add(left+1);
               result.add(right+1);

               return result;
           }
        }
       result.add(-1);
           return result; 
        
    }
}

}
