import java.util.Scanner;

public class Main {
    // D - Takahashi Unevolved
    // https://atcoder.jp/contests/abc180/tasks/abc180_d
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 初期強さ
        long X = sc.nextLong();
        // 進化する強さ
        long Y = sc.nextLong();
        // 過去問ジム　強さがA倍
        long A = sc.nextLong();
        // atCoderジム　強さがB加算
        long B = sc.nextLong();
        sc.close();
        long expRate = 0L;
        // ↓これだとTLE
        // while(X < Y) {
        //     if(X * A > X + B) {
        //         X += B;
        //     } else {
        //         X *= A;
        //     }
    
        //     if(X < Y) {
        //         expRate += 1;
        //     } else {
        //         System.out.println(expRate);
        //         return;
        //     }
        // }
        while(X < Y) {
            if(X < (X + B) / A && X < Y / A) {
                X *= A;
                expRate += 1;
            } else {
                long rem = Y - X - 1;
                expRate += rem / B;
                break;
            }
        }
        System.out.println(expRate);
    }
}