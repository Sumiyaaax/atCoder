import java.util.Scanner;

public class Main {
    // A - Harmony
    // https://atcoder.jp/contests/abc135/tasks/abc135_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        final String IMPOSSIBLE = "IMPOSSIBLE";
        int K = 0;
        if(A % 2 != B % 2) {
            System.out.println(IMPOSSIBLE);
            return;
        } else {
            K = (A + B) / 2;
        }
        System.out.println(K);
    }
} 
