import java.util.Scanner;

public class Main {
    // A - kcal
    // https://atcoder.jp/contests/abc205/tasks/abc205_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        sc.close();
        double answer = A * (B / 100);
        System.out.println(answer);
    }
} 
