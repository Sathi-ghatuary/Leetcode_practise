public class Smallest_Num_allset{
    public static int smallest_num(int n){
        int x=n;
        while((x&(x+1))!=0){
            x++;
        }
        return x;
    }
}