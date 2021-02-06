import java.util.Scanner;

public class Main {
    // B - Multiple of 9
    // https://atcoder.jp/contests/abc176/tasks/abc176_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        sc.close();
        char[] numCharArray = num.toCharArray();
        long total = 0;
        String answer = "No";
        for(int i = 0; i < numCharArray.length; i++) {
            total += Character.getNumericValue(numCharArray[i]);
        }
        if(total % 9 == 0) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
}