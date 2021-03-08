import java.util.Scanner;

public class Main {
    // A - We Love Golf
    // https://atcoder.jp/contests/abc165/tasks/abc165_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        String answer = "NG";
        for(int i = A; i <= B; i++) {
            if(i % K == 0) {
                answer = "OK";
                break;
            }
        }
        System.out.println(answer);
    }
}