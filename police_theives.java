import java.util.*;
public class police_theives {
    public int catchThieves(char[]arr,int k){
        //store police and thief
        int n =arr.length;
        ArrayList<Integer>police=new ArrayList<>();
        ArrayList<Integer>thief=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]=='P'){
                police.add(i);
            }else if(arr[i]=='T'){
                thief.add(i);
            }

        }
        int i=0,j=0,count=0;
        while(i<police.size()&&j<thief.size()){
            if(Math.abs(police.get(i)-thief.get(j))<=k){
                count++;
                i++;
                j++;
            }else if(police.get(i)<thief.get(j)){
                i++;
            }else{
                j++;
            }
        }
        return count;

    }
}
