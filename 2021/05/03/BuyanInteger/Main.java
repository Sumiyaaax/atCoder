import java.util.Scanner;

public class Main {
    // C - Buy an Integer
    // https://atcoder.jp/contests/abc146/tasks/abc146_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long X = sc.nextLong();
        sc.close();
        long min = 0;
        long max = 1000000001;
        while(max - min > 1) {
            long mid = (min + max) / 2;
            long tmp = (A * mid) + (B * String.valueOf(mid).length());
            if(tmp > X) {
                max = mid;
            } else {
                min = mid;
            }
        }
        System.out.println(min);
    }
} 
