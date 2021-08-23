import java.util.Scanner;

public class Main {
    // B - Factorial Yen Coin
    // https://atcoder.jp/contests/abc208/tasks/abc208_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        sc.close();
        int answer = 0;
        int total = 0;
        int[] factorialList = new int[11];
        for(int i = 1; i < factorialList.length; i++) {
            factorialList[i] = factorial(i);
        }
        for(int i = 10; i > 0; i--) {
            while(factorialList[i] <= P - total) {
                total += factorialList[i];
                answer ++;
            } 
        }
        System.out.println(answer);
    }
    private static int factorial(int i) {
        int tmp = 1;
        for(int j = 1; j <= i; j++) {
            tmp *= j;
        }
        return tmp;
    }
} 
