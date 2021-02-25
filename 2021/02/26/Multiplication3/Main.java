import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    // C - Multiplication 3
    // https://atcoder.jp/contests/abc169/tasks/abc169_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal A = BigDecimal.valueOf(sc.nextLong());
        BigDecimal B = BigDecimal.valueOf(sc.nextDouble());
        sc.close();
        BigDecimal answer = (A.multiply(B)).setScale(0, RoundingMode.DOWN);
        System.out.println(answer);
    }
}