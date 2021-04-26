import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // A - Round One
    // https://atcoder.jp/contests/abc148/tasks/abc148_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int answer = 0;
        if((A == 1 && B == 2) || (A == 2 && B == 1)) {
            answer = 3;
        } else if((A == 2 && B == 3) || (A == 3 && B == 2)) {
            answer = 1;
        } else if((A == 3 && B == 1) || (A == 1 && B == 3)) {
            answer = 2;
        }
        System.out.println(answer);
    }
} 
