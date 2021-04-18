import java.util.Scanner;

public class Main {
    // A - Next Alphabet
    // https://atcoder.jp/contests/abc151/tasks/abc151_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        sc.close();
        c[0]++;
        System.out.println(c[0]);
    }
} 
