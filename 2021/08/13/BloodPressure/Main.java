import java.util.Scanner;

public class Main {
    //  - Blood Pressure
    // https://atcoder.jp/contests/abc211/tasks/abc211_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        sc.close();
        double answer = (A - B) / 3 + B;
        System.out.println(answer);
    }
} 
