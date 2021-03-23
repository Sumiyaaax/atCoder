import java.util.Scanner;

public class Main {
    // B - String Palindrome
    // https://atcoder.jp/contests/abc159/tasks/abc159_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        String first = S.substring(0, ((S.length() - 1) / 2));
        String second = S.substring(((S.length() + 2) / 2));
        String answer = "No";
        if(first.equals(second)) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
}