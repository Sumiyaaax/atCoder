import java.util.Scanner;

public class Main {
    // D - Wandering
    // https://atcoder.jp/contests/abc182/tasks/abc182_d
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] numList = new long[N];
        for(int i = 0; i < N; i++) {
            numList[i] = sc.nextLong();
        }
        sc.close();
        long max = 0;
        long position = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                position += numList[j];
                if(position > max) {
                    max = position;
                }
            }
        }
        System.out.println(max);
    }
}