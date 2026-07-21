public class gcd {
    public int findGCD(int[] nums) {
        int min=1001,mx=0;
        for(int num:nums){
            if(num<min)
              min=num;
            if(num>mx)
              mx=num;
        }
        return gcd(min,mx);

    }
    private int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }

}
