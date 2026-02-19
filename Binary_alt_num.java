public class Binary_alt_num {
    public int alt_num(int n){
       int x=n^(n>>1);
       return (x&(x+1))==0;
    }
}