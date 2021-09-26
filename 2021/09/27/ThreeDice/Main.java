import java.util.Scanner;

public class Main {
    // A - Three Dice
    // https://atcoder.jp/contests/abc202/tasks/abc202_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int answer = (7 - a) + (7 - b) + (7 - c);
        System.out.println(answer);
    }
} 
