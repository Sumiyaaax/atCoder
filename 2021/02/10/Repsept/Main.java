import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();
        int tmp = 0;
        int answer = -1;
        for(int i = 1; i <= K; i++) {
            tmp = tmp * 10 + 7;
            answer = tmp % K;
            if(answer == 0) {
                System.out.println(i);
                return;
            }
            tmp = tmp % K;
        }
        System.out.println(-1);
    }
}