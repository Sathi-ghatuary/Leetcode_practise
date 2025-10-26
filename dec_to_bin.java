public class dec_to_bin {
    public int decimal_to_binary(int decNum){
        int pow=0;
        int binNum=0;
        while(decNum>0){
           int  lastdigit=decNum%2;
           binNum=binNum+(lastdigit*(int)Math.pow(10,pow));
           pow++;
           decNum=decNum/2;
 
          
        }
        return binNum;
    }
}
