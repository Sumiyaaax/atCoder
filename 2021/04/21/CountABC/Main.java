import java.util.Scanner;

public class Main {
    // B - Count ABC
    // https://atcoder.jp/contests/abc150/tasks/abc150_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int answer = 0;
        sc.close();
        for(int i = 0; i < N - 2; i++) {
            if(S[i] == 'A' && S[i + 1] == 'B' && S[i + 2] == 'C') {
                answer ++;
            }
        }
        System.out.println(answer);
    }
} 
