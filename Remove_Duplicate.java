import java.util.ArrayList;

public class Remove_Duplicate {
    ArrayList<Integer> finddup(int arr[]){
        ArrayList<Integer> res=new ArrayList<>();
        if(arr.length==0) return 0;
        res.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                res.add(arr[i]);
            }
        }
        return res;
    }
}
