import java.util.*;

public class MinusTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int oddCount = 0, evenCount = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0) evenCount++;
                else oddCount++;
            }
            System.out.println(Math.max(oddCount, evenCount));
        }
        sc.close();
    }
}
