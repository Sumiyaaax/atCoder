import java.util.Scanner;

public class Main {
    // A - Coffee
    // https://atcoder.jp/contests/abc160/tasks/abc160_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charS = sc.next().toCharArray();
        sc.close();
        String answer = "No";
        if(charS[2] == charS[3] && charS[4] == charS[5]) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
}