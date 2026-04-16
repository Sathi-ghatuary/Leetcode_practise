import java.util.Scanner;

public class Main {
    public static String determineColor(String s) {
        // Write your logic here to determine the color based on the string s.
        // Return "Black" or "White" based on the problem statement.
        char col = s.charAt(0);   // column (a-h)
        char row = s.charAt(1);   // row (1-8)
        
        int colValue = col - 'a' + 1;
        int rowValue = row - '0';
        
        if ((colValue + rowValue) % 2 == 0) {
            return "Black";
        } else {
            return "White";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}