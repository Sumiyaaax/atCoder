import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // B - Mix Juice
    // https://atcoder.jp/contests/abc171/tasks/abc171_b
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] priceList = new int[N];
        for(int i = 0; i < N; i++) {
            priceList[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(priceList);
        int total = 0;
        for(int i = 0; i < K; i++) {
            total += priceList[i];
        }
        System.out.println(total);
    }
}