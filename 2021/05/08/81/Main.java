import java.util.Scanner;

public class Main {
    // B - 81
    // https://atcoder.jp/contests/abc144/tasks/abc144_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        String answer = "No";
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                if(i * j == N) {
                    answer = "Yes";
                    break;
                }
            }
        }
        System.out.println(answer);
    }
} 
