import java.util.Scanner;

public class Main {
    // A - A?C
    // https://atcoder.jp/contests/abc166/tasks/abc166_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        String answer = "ABC";
        if(S.equals(answer)) {
            answer = "ARC";
        }
        System.out.println(answer);
    }
}