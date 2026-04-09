import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            Arrays.sort(a);

            int m = n - k;                    // remaining elements
            int medianPos = (m + 1) / 2;      // 1-indexed median position (ceiling)

            int lo = medianPos - 1;           // min valid index
            int hi = n - 1 - m + medianPos;   // max valid index

            // Use TreeSet to auto-sort and deduplicate
            TreeSet<Integer> result = new TreeSet<>();
            for (int i = lo; i <= hi; i++) {
                result.add(a[i]);
            }

            StringBuilder sb = new StringBuilder();
            for (int val : result) {
                sb.append(val).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
