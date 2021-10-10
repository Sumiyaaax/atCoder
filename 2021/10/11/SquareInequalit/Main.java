import java.util.Scanner;

public class Main {
    // A - Square Inequality
    // https://atcoder.jp/contests/abc199/tasks/abc199_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        String answer = "No";
        if(Math.pow(A, 2) + Math.pow(B, 2) < Math.pow(C, 2)) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
} 
