import java.util.Scanner;

public class Main {
    // A - Not
    // https://atcoder.jp/contests/abc178/tasks/abc178_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int answer = 0;
        if(x == 0) {
            answer = 1;
        }
        System.out.println(answer);
    }
}