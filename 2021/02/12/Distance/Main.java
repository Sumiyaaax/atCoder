import java.util.Scanner;

public class Main {
    // B - Distance
    // https://atcoder.jp/contests/abc174/tasks/abc174_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int answer = 0;
        for(int i = 0; i < N; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if(D >= Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2))) {
                answer ++;
            }
        }
        sc.close();
        System.out.println(answer);
    }
}