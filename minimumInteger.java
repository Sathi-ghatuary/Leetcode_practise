import java.util.HashSet;
import java.util.ArrayList;

public class minimumInteger {
    public ArrayList<Integer> minimum(int arr[],int low,int high){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=low;i<=high;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
