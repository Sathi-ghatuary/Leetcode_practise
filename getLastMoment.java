public class getLastMoment {
    public int getLastMoments(int n, int left[], int right[]) {
        
        int maxtime=0;
        for(int x:left){
            maxtime=Math.max(maxtime,x);
        }
        for(int x:right){
            maxtime=Math.max(maxtime,n-x);
        }
        return maxtime;
    }
}
