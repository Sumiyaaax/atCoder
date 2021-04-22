import java.util.Scanner;

public class Main {
    // A - 500 Yen Coins
    // https://atcoder.jp/contests/abc150/tasks/abc150_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        sc.close();
        String answer = "No";
        if(K * 500 >= X) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
} 
