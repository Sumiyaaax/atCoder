import java.util.Scanner;

public class Main {
    // C - Min Difference
    // https://atcoder.jp/contests/abc212/tasks/abc212_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        String answer = "Alloy";
        if(A > 0 && B == 0) {
            answer = "Gold";
        } else if(A == 0 && B > 0) {
            answer = "Silver";
        }
        System.out.println(answer);
    }
} 
