import java.util.Scanner;

public class Main {
    // B - Common Raccoon vs Monster
    // https://atcoder.jp/contests/abc153/tasks/abc153_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int total = 0;
        for(int i = 0; i < N; i++) {
            total += sc.nextInt();
        }
        sc.close();
        String answer = "No";
        if(H <= total) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
} 
