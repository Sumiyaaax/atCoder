import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // C - POW
    // https://atcoder.jp/contests/abc205/tasks/abc205_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        String answer = "=";
        if(Math.pow(A, C) > Math.pow(B, C)) {
            answer = ">";
        } else if(Math.pow(A, C) < Math.pow(B, C)) {
            answer = "<";
        }
        System.out.println(answer);
    }
} 
