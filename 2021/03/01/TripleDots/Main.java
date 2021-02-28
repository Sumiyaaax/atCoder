import java.util.Scanner;

public class Main {
    // B - ... (Triple Dots)
    // https://atcoder.jp/contests/abc168/tasks/abc168_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String S = sc.next();
        sc.close();
        if(K >= S.length()) {
            System.out.println(S);
            return;
        }
        char[] charS = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < charS.length; i++) {
            if(K >= i + 1) {
                sb.append(charS[i]);
            } else {
                sb.append("...");
                break;
            }
        }
        System.out.println(sb.toString());
    }
}