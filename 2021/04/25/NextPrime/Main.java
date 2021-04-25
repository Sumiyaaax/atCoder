import java.util.Scanner;

public class Main {
    // C - Next Prime
    // https://atcoder.jp/contests/abc149/tasks/abc149_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        int answer = 0;
        boolean flag = true;
        while(flag) {
            int count = 0;
            for(int i = 2; i <= X; i++) {
                if(X % i == 0) {
                    count++;
                }
            }
            if(count == 1) {
                answer = X;
                flag = false;
            }
            X ++;
        }
        System.out.println(answer);
    }
} 
