import java.util.Scanner;

public class Main {
    // A - Biscuit Generator
    // https://atcoder.jp/contests/abc125/tasks/abc125_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        sc.close();
        int i = 1;
        int answer = 0;
        while(a * i <= t) {
            answer += b;
            i++;
        }
        System.out.println(answer); 
    }
} 
