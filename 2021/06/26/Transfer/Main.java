import java.util.Scanner;

public class Main {
    // A - Transfer
    // https://atcoder.jp/contests/abc136/tasks/abc136_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        int answer = C - (A - B) > 0 ? C - (A - B) : 0;
        System.out.println(answer);
    }
} 
