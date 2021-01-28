import java.util.Scanner;

public class Main {
    // A - Plural Form
    // https://atcoder.jp/contests/abc179/tasks/abc179_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        String answer;
        if(S.substring(S.length() - 1).equals("s")) {
            answer = S + "es";
        } else {
            answer = S + "s";
        }
        System.out.println(answer);
    }
}