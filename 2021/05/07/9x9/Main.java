import java.util.Scanner;

public class Main {
    // A - 9x9
    // https://atcoder.jp/contests/abc144/tasks/abc144_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int answer = -1;
        if(A < 10 && B < 10) {
            answer = A * B;
        }
        System.out.println(answer);
    }
} 
