import java.util.Scanner;

public class Main {
    // B - Savings
    // https://atcoder.jp/contests/abc206/tasks/abc206_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int total = 0;
        int countDate = 0;
        while(total < N) {
            countDate ++; 
            total += countDate;
        }
        System.out.println(countDate);
    }
} 
