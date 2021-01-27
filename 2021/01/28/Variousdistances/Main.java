import java.util.Scanner;

public class Main {
    // B - Various distances
    // https://atcoder.jp/contests/abc180/tasks/abc180_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] numArray = new long[N];
        for(int i = 0; i < N; i++) {
            numArray[i] = sc.nextLong();
        }
        sc.close();
        long manhattan = 0L;
        double euclid = 0d;
        long chebyshev = 0L;
        for(int i = 0; i < N; i++) {
            manhattan += Math.abs(numArray[i]);
            euclid = Math.sqrt((Math.pow(Math.abs(euclid), 2) + Math.pow(Math.abs(numArray[i]), 2)));
            chebyshev = Math.max(chebyshev, numArray[i]);
        }
        System.out.println(manhattan);
        System.out.println(String.format("%.15f", euclid));
        System.out.println(chebyshev);
    }
}