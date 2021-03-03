import java.util.Scanner;

public class Main {
    // A - αlphabet
    // https://atcoder.jp/contests/abc171/tasks/abc171_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        if(S.matches("^[A-Z]+$")) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}