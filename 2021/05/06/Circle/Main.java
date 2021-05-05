import java.util.Scanner;

public class Main {
    // A - Circle
    // https://atcoder.jp/contests/abc145/tasks/abc145_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();
        int answer = (int) Math.pow(r, 2);
        System.out.println(answer);
    }
} 
