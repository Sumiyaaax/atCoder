import java.util.Scanner;

public class Main {
    // B - Uneven Numbers
    // https://atcoder.jp/contests/abc136/tasks/abc136_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i = 1; i <= N; i++) {
            if(String.valueOf(i).length() % 2 != 0) {
                sum ++;
            }
        }
        System.out.println(sum);
    }
} 
