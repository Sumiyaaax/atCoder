import java.util.Scanner;

public class Main {
    // A - Serval vs Monster
    // https://atcoder.jp/contests/abc153/tasks/abc153_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();
        sc.close();
        int answer = 0;
        if(H % A == 0) {
            answer = H / A;
        } else {
            answer = H / A + 1;
        }
        System.out.println(answer);
    }
} 
