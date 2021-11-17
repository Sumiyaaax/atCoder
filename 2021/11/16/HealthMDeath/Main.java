import java.util.Scanner;

public class Main {
    // A - Health M Death
    // https://atcoder.jp/contests/abc195/tasks/abc195_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int H = sc.nextInt();
        sc.close();
        String answer = "No";
        if(H % M == 0) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
} 
