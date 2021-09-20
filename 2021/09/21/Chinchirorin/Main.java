import java.util.Scanner;

public class Main {
    // A - Chinchirorin
    // https://atcoder.jp/contests/abc203/tasks/abc203_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int answer = 0;
        if(a == b) {
            answer = c;
        } else if(b == c) {
            answer = a;
        } else if(c == a) {
            answer = b;
        }
        System.out.println(answer);
    }
} 
