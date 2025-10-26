public class bin_to_dec{
    public int binary_to_decimal(int binNum){
        int pow=0;
        int decNum=0;
        while(binNum>0){
           int  lastdigit=binNum%10;
           decNum=decNum+(lastdigit*(int)Math.pow(2,pow));
           pow++;
           binNum=binNum/10;
 
          
        }
        return decNum;
    }
}