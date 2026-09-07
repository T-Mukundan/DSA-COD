import java.util.*;
import java.io.*;

public class OddEraser {
    // Function to compute gcd of two numbers
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());  // number of test cases

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());  // size of array
            String[] parts = br.readLine().split(" ");
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(parts[i]);
            }

            long gcdOdd = 0, gcdEven = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) { // 0-based index → odd position in 1-based
                    gcdOdd = gcd(gcdOdd, arr[i]);
                } else {
                    gcdEven = gcd(gcdEven, arr[i]);
                }
            }

            System.out.println(Math.max(gcdOdd, gcdEven));
        }
    }
}
