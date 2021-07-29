import java.util.Scanner;

public class Main {
    // A - Ferris Wheel
    // https://atcoder.jp/contests/abc127/tasks/abc127_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int answer;
        if(a >= 13) {
            answer = b;
        } else if(a <= 5) {
            answer = 0;
        } else {
            answer = b / 2;
        }
        System.out.println(answer);
    }
} 
