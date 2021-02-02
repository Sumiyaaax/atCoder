import java.util.Scanner;

public class Main {
    // A - Don't be late
    // https://atcoder.jp/contests/abc177/submissions/me
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double D = sc.nextDouble();
        double T = sc.nextDouble();
        double S = sc.nextDouble();
        sc.close();
        String answer = "No";
        if(D / S <= T) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
}