import java.util.Scanner;

public class Main {
    // A - Tenki
    // https://atcoder.jp/contests/abc139/tasks/abc139_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        sc.close();
        int answer = 0;
        for(int i = 0; i < s.length; i++) {
            if(s[i] == t[i]) {
                answer++;
            }
        }
        System.out.println(answer);
    }
} 
