import java.util.Scanner;

public class Main {
    // B - YYMM or MMYY
    // https://atcoder.jp/contests/abc126/tasks/abc126_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        int num1 = Integer.parseInt(S.substring(0, 2));
        int num2 = Integer.parseInt(S.substring(2, 4));
        String answer = "NA";
        if((num1 >= 1 && num1 <= 12) && (num2 >= 1 && num2 <= 12)) {
            answer = "AMBIGUOUS";
        } else if((num1 >= 1 && num1 <= 12) && !(num2 >= 1 && num2 <= 12)) {
            answer = "MMYY";
        } else if(!(num1 >= 1 && num1 <= 12) && (num2 >= 1 && num2 <= 12)) {
            answer = "YYMM";
        }
        System.out.println(answer);
    }
} 
