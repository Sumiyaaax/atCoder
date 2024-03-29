import java.util.Scanner;

public class Main {
    // B - Palindrome with leading zero
    // https://atcoder.jp/contests/abc198/tasks/abc198_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        String first;
        String second;
        String NStr = String.valueOf(N);

        if(N % 2 == 0) {
            first = NStr.substring(0, NStr.length() / 2);
            second = NStr.substring(NStr.length() / 2);
        } else {
            first = NStr.substring(0, (NStr.length() - 1) / 2);
            second = NStr.substring((NStr.length() - 1) / 2);
        }
        System.out.println(first);
        System.out.println(second);
    }
} 
