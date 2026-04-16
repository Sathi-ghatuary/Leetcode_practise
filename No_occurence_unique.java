
public class No_occurence_unique {
    
public int[] minOperations(String boxes) {
    int n = boxes.length();
    int[] answer = new int[n];
    
    // Calculate operations for moving balls to the left
    int balls = 0, operations = 0;
    for (int i = 0; i < n; i++) {
        answer[i] += operations;
        if (boxes.charAt(i) == '1') balls++;
        operations += balls;
    }
    
    // Calculate operations for moving balls to the right
    balls = 0; operations = 0;
    for (int i = n - 1; i >= 0; i--) {
        answer[i] += operations;
        if (boxes.charAt(i) == '1') balls++;
        operations += balls;
    }
    
    return answer;
}
}