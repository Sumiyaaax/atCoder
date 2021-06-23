import java.util.Scanner;

public class Main {
    // A - Dodecagon
    // https://atcoder.jp/contests/abc134/tasks/abc134_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();
        System.out.println((int) (3 * Math.pow(r, 2)));

    }
} 
