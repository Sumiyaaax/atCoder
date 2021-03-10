import java.util.Scanner;

public class Main {
    // A - Sheep and Wolves
    // https://atcoder.jp/contests/abc164/tasks/abc164_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int W = sc.nextInt();
        sc.close();
        String answer = "safe";
        if(S <= W) {
            answer = "unsafe";
        }
        System.out.println(answer);
    }
}