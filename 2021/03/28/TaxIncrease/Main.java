import java.util.Scanner;

public class Main {
    // C - Tax Increase
    // https://atcoder.jp/contests/abc158/tasks/abc158_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int answer = -1;
        for(int i = 1; i < 1010; i++) {
            int eight = (int)Math.floor(i * 0.08);
            int ten = (int)Math.floor(i * 0.1);
            if(eight == A && ten == B) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}