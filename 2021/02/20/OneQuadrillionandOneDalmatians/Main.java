import java.util.Scanner;

public class Main {
    // C - One Quadrillion and One Dalmatians
    // https://atcoder.jp/contests/abc171/tasks/abc171_c
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();
        StringBuilder sb = new StringBuilder();
        while(N != 0) {
            N --;
            sb.insert(0, (char) ('a' + (N % 26)));
            N /= 26;
        }
        System.out.println(sb.toString());
    }
}