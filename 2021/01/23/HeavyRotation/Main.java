import java.util.Scanner;

public class Main {
    // A - Heavy Rotation
    // https://atcoder.jp/contests/abc181/tasks/abc181_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        String answer;
        if(N % 2 == 0) {
            answer = "White";
        } else {
            answer = "Black";
        }
        System.out.println(answer);
    }
}