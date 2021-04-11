import java.util.Scanner;

public class Main {
    // B - I miss you...
    // https://atcoder.jp/contests/abc154/tasks/abc154_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strLength = sc.next().length();
        sc.close();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strLength; i++) {
            sb.append("x");
        }
        System.out.println(sb.toString());
    }
} 