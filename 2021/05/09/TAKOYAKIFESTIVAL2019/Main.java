import java.util.Scanner;

public class Main {
    // B - TAKOYAKI FESTIVAL 2019
    // https://atcoder.jp/contests/abc143/tasks/abc143_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] deliciousPointList = new int[N];
        for(int i = 0; i < N; i++) {
            deliciousPointList[i] = sc.nextInt();
        }
        sc.close();
        int total = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                total += deliciousPointList[i] * deliciousPointList[j];
            }
        }
        System.out.println(total);
    }
} 
