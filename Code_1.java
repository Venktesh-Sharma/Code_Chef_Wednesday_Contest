import java.util.*;
import java.lang.*;
import java.io.*;
public class Code_1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 5) {
            System.out.println(n * 85);  // bulk discount
        } else {
            System.out.println(n * 100); // regular price
        }
    }
}

