public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero=0;
        int one=0;
        for(int s:students){
            if(s==0) zero++;
            else one++;

        }
        for(int sand:sandwiches){
            if(sand==0){
                if(zero==0) break;
                zero--;
            }else{
                if(one==0) break;
                one--;
            }
        }
        return one+zero;
    }
}