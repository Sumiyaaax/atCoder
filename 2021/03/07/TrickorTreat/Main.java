import java.util.Scanner;

public class Main {
    // B - Trick or Treat
    // https://atcoder.jp/contests/abc166/tasks/abc166_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] snackList = new int[N + 1];
        for(int i = 0; i < K; i++) {
            int tmp = sc.nextInt();
            for(int j = 0; j < tmp; j++) {
                snackList[sc.nextInt()] ++;
            }
        }
        sc.close();
        int answer = 0;
        for(int i = 1; i < snackList.length; i++) {
            if(snackList[i] == 0) {
                answer ++;
            }
        }
        System.out.println(answer);
    }
}