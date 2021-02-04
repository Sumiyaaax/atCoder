import java.util.Scanner;

public class Main {
    // B - Substring
    // https://atcoder.jp/contests/abc177/tasks/abc177_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        sc.close();
        int answer = 1000;
        char[] charT = T.toCharArray();
        for(int i = 0; i < S.length() - T.length(); i++) {
            char[] charS = S.substring(i, i + T.length()).toCharArray();
            if(charS.length != charT.length) {
                break;
            }
            int needChangeChar = 0;
            for(int j = 0; j < charT.length; j++) {
                if(charT[j] != charS[j]) {
                    needChangeChar += 1;
                }
            }
            if(answer > needChangeChar) {
                answer = needChangeChar;
            }
        }
        System.out.println(answer);
    }
}