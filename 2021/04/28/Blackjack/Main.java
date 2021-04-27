import java.util.Scanner;

public class Main {
    // A - Blackjack
    // https://atcoder.jp/contests/abc147/tasks/abc147_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        total += sc.nextInt();
        total += sc.nextInt();
        total += sc.nextInt();
        sc.close();
        String answer = "win";
        if(total >= 22) {
            answer = "bust";
        }
        System.out.println(answer);
    }
} 
