import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    // A - Circle Pond
    // https://atcoder.jp/contests/abc163/tasks/abc163_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal R = new BigDecimal(sc.nextInt());
        BigDecimal TWO = new BigDecimal(2);
        BigDecimal circle = R.multiply(TWO);
        sc.close();
        BigDecimal pi = new BigDecimal("3.14");
        BigDecimal answer = circle.multiply(pi);
        System.out.println(answer);
    }
}