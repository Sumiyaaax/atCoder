import java.util.Scanner;

public class Main {
    // B - Tap Dance
    // https://atcoder.jp/contests/abc141/tasks/abc141_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        sc.close();
        String answer = "Yes";
        for(int i = 1; i <= S.length; i ++) {
            if(i % 2 == 0) {
                if(S[i - 1] == 'R') {
                    answer = "No";
                    break;
                }
            } else {
                if(S[i - 1] == 'L') {
                    answer = "No";
                    break;
                }
            }
        }
        System.out.println(answer);
    }
} 
