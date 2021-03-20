import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    // C - gacha
    // https://atcoder.jp/contests/abc164/tasks/abc164_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        Set<String> productSet = new HashSet<>();
        for(int i = 0; i < N; i++) {
            productSet.add(sc.next());
        }
        sc.close();
        System.out.println(productSet.size());
    }
}