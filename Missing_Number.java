public class Missing_Number {
    
    int missingNum(int arr[]) {
       int n = arr.length + 1; // because one number is missing
        
        long total =(long) n * (n + 1) / 2;
        long sum = 0;
        
        for(int num : arr) {
            sum += num;
        }
        
        return (int)(total - sum);
        
    }

}
