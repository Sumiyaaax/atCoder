import java.util.Scanner;

public class Main {
    // B - Battle
    // https://atcoder.jp/contests/abc164/tasks/abc164_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();
        String answer = "No";
        while(A > 0 && C > 0) {
            C -= B;
            if(C <= 0) {
                answer = "Yes";
                break;
            }
            A -= D;
            if(A <= 0) {
                break;
            }
        }
        System.out.println(answer);
    }
}