import java.util.Scanner;

public class Main {
    // A - Rolling Dice
    // https://atcoder.jp/contests/abc208/tasks/abc208_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        double num = (double) B / A;
        String answer = "No";
        if(num >= 1 && num <= 6) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
} 
