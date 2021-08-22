import java.util.Scanner;

public class Main {
    // A - Counting
    // https://atcoder.jp/contests/abc209/tasks/abc209_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int answer = 0;
        if(A >= B) {
            answer = 0;
        } else {
            answer = B - A + 1;
        }
        System.out.println(answer);
    }
} 
