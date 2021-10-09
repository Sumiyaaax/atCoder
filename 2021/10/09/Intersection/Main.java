import java.util.Scanner;

public class Main {
    // B - Intersection
    // https://atcoder.jp/contests/abc199/tasks/abc199_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] aList = new int[N];
        int[] bList = new int[N];
        for(int i = 0; i < N; i++) {
            aList[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            bList[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < N; i++) {
            bList[i] = sc.nextInt();
        }
    }
} 
