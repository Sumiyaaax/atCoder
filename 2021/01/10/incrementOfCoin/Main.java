import java.util.Scanner;

public class Main {
    static double dp[][][] = new double[100][100][100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        sc.close();
        System.out.println(String.format("%.9f", f(A, B, C)));
    }
    public static <C> double f(double A, double B, double C) {
        // 終端条件
        if(A >= 100 || B >= 100 || C >= 100) {
            return 0.0;
        }
        // メモ化
        if(dp[(int) A][(int) B][(int) C] > 0.0) {
            return dp[(int) A][(int) B][(int) C];
        }
        double answer = 0;
        answer += (f(A + 1, B, C) + 1) * (A / (A + B + C));
        answer += (f(A, B + 1, C) + 1) * (B / (A + B + C));
        answer += (f(A, B, C + 1) + 1) * (C / (A + B + C));
        return dp[(int) A][(int) B][(int) C] = answer;
    }
}