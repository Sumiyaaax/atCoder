import java.util.Scanner;

public class Main {
    // B - Nuts 
    // https://atcoder.jp/contests/abc204/tasks/abc204_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(num > 10) {
                total += num - 10;
            }
        }
        sc.close();
        System.out.println(total);
    }
} 
