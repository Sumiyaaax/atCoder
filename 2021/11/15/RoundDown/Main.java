import java.util.Scanner;

public class Main {
    // B - Round Down
    // https://atcoder.jp/contests/abc196/tasks/abc196_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        sc.close();
        String num;
        if(x.indexOf(".") != -1) {
            num = x.substring(0, x.indexOf("."));
        } else {
            num = x;
        }
        System.out.println(num);
    }
} 
