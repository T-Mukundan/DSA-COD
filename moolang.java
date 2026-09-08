import java.util.*;

public class MooLanguageSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int ans = 0;
            // Process farms of size k
            for (int i = 0; i < n; i += k) {
                String farm = s.substring(i, i + k);
                if (!farm.contains("0")) { // all fields owned by Nhoj
                    ans++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
