import java.util.Scanner;

public class Main {
    // B - FizzBuzz Sum
    // https://atcoder.jp/contests/abc162/tasks/abc162_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        long answer = 0;
        for(int i = 1; i <= num; i++) {
            if(i % 3 != 0 && i % 5 != 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}