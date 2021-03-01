import java.util.Scanner;

public class Main {
    // A - ∴ (Therefore)
    // https://atcoder.jp/contests/abc168/tasks/abc168_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charN = sc.next().toCharArray();
        sc.close();
        String answer = "";
        if(charN[charN.length - 1] == '3') {
            answer = "bon";
        } else if(charN[charN.length - 1] == '0' || charN[charN.length - 1] == '1' || charN[charN.length - 1] == '6' || charN[charN.length - 1] == '8') {
            answer = "pon";
        } else {
            answer = "hon";
        }
        System.out.println(answer);
    }
}