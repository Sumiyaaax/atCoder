import java.util.Scanner;

public class Main {
    // A - Station and Bus
    // https://atcoder.jp/contests/abc158/tasks/abc158_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        String answer = "Yes";
        if(S.equals("AAA") || S.equals("BBB")) {
            answer = "No";
        }
        System.out.println(answer);
    }
}