import java.util.Scanner;

public class Main {
    // A - Transfer
    // https://atcoder.jp/contests/abc136/tasks/abc136_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int P = sc.nextInt();
        sc.close();
        System.out.println((A * 3 + P) / 2);
    }
} 
