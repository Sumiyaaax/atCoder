import java.util.Scanner;

public class Main {
    // B - 200th ABC-200
    // https://atcoder.jp/contests/abc200/tasks/abc200_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int K = sc.nextInt();
        sc.close();
        for(int i = 0; i < K; i++) {
            if(N % 200 == 0) {
                N = N / 200;
            } else {
                String nStr = String.valueOf(N) + "200";
                N = Long.parseLong(nStr);
            }
        }
        System.out.println(N);
    }
} 
