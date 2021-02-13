import java.util.Scanner;

public class Main {
    // A - Air Conditioner
    // https://atcoder.jp/contests/abc174/tasks/abc174_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        String answer = "No";
        if(X >= 30) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
}