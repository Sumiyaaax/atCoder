import java.util.Scanner;

public class Main {
    // A - Can't Wait for Holiday
    // https://atcoder.jp/contests/abc146/tasks/abc146_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        int answer = 0;
        if(S.equals("SUN")) {
            answer = 7;
        } else if(S.equals("MON")) {
            answer = 6;
        } else if(S.equals("TUE")) {
            answer = 5;
        } else if(S.equals("WED")) {
            answer = 4;
        } else if(S.equals("THU")) {
            answer = 3;
        } else if(S.equals("FRI")) {
            answer = 2;
        } else if(S.equals("SAT")) {
            answer = 1;
        }
        System.out.println(answer);
    }
} 
