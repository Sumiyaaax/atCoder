import java.util.Scanner;

public class Main {
    // B - Power Socket
    // https://atcoder.jp/contests/abc139/tasks/abc139_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int answer = 0;
        if(B <= A) {
            answer = 1;
        } else {
            answer = B / A + 1;
        }
        System.out.println(answer);
    }
} 
