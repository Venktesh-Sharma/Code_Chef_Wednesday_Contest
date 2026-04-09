import java.util.Scanner;

public class Code_3 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); // tickets
            int m = sc.nextInt(); // popcorns
            int a = sc.nextInt(); // ticket price
            int b = sc.nextInt(); // popcorn price
            int c = sc.nextInt(); // combo price

            int combos = Math.min(n, m);
            int remainingTickets  = n - combos;
            int remainingPopcorns = m - combos;

            int cost = combos * c + remainingTickets * a + remainingPopcorns * b;
            System.out.println(cost);
        }
    }
    
}

