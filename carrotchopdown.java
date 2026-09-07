import java.util.*;
import java.io.*;

public class CarrotChopdownEasy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            String[] parts = br.readLine().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(parts[i]);

            int[] freq = new int[m+1];
            for (int val : a) freq[val]++;

            int ans = 0;
            for (int x = 1; x <= m; x++) {
                int count = freq[x];
                for (int val : a) {
                    if (val > x) count++; // each larger carrot can give one x
                }
                ans = Math.max(ans, count);
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
