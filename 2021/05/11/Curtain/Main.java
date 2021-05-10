import java.util.Scanner;

public class Main {
    // A - Curtain
    // https://atcoder.jp/contests/abc143/tasks/abc143_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int answer = A - B * 2 < 0 ? 0 : A - B * 2;
        System.out.println(answer);
    }
} 
