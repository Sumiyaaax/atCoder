import java.util.Scanner;

public class Main {
    // A - Rock-paper-scissors
    // https://atcoder.jp/contests/abc204/tasks/abc204_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int answer = x;
        if((x == 0 && y == 1) || (x == 1 && y == 0)) {
            answer = 2;
        } else if((x == 1 && y == 2) || (x == 2 && y == 1)) {
            answer = 0;
        } else if((x == 0 && y == 2) || (x == 2 && y == 0)) {
            answer = 1;
        }
        System.out.println(answer);
    }
} 
