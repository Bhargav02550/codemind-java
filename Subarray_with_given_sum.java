import java.util.*;
class Main {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n, s;
            n = sc.nextInt();
            s = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            System.out.println(subArray(a, n, s));
        }
    }

    private static String subArray(int[] a, int n, int s) {
        int sum = 0;
        int start = 0;
        String res = "-1";
        for (int i = 0; i < n; i++) {
            sum += a[i];
            while (sum > s) {
                sum -= a[start];
                start++;
            }
            if (sum == s) {
                res = (start + 1) + " " + (i + 1);
                break;
            }
        }
        return res;
    }
}