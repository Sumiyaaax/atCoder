import java.util.Scanner;

public class Main {
    // A - Rainy Season
    // https://atcoder.jp/contests/abc175/tasks/abc175_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        int tmp = 0;
        int max = 0;
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'R') {
                tmp += 1;
            } else {
                tmp = 0;
            }
            if(max < tmp) {
                max = tmp;
            }
        }
        System.out.println(max);
    }
}