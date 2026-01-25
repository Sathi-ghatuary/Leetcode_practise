public class Guess_word {
    public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // number of test cases
        
        while (T-- > 0) {
            String S = sc.next(); // hidden word
            String G = sc.next(); // guess word
            
            StringBuilder M = new StringBuilder();
            
            for (int i = 0; i < 5; i++) {
                if (S.charAt(i) == G.charAt(i)) {
                    M.append('G');
                } else {
                    M.append('B');
                }
            }
            
            System.out.println(M.toString());
        }
        
        sc.close();

	}
}
