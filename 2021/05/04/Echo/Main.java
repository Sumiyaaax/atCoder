import java.util.Scanner;

public class Main {
    // B - Echo
    // https://atcoder.jp/contests/abc145/tasks/abc145_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        sc.close();
        String answer = "No";
        if(N % 2 != 0) {
            System.out.println(answer);
            return;
        }
        if(S.substring(0, N / 2).equals(S.substring(N / 2))) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
} 
