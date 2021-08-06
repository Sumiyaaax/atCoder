import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // B - Resale
    // https://atcoder.jp/contests/abc125/tasks/abc125_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] valueList = new int[N];
        int[] costList = new int[N];
        for(int i = 0; i < N; i++) {
            valueList[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            costList[i] = sc.nextInt();
        }
        sc.close();
        int answer = 0;
        for(int i = 0; i < N; i++) {
            if(valueList[i] > costList[i]) {
                answer += valueList[i] - costList[i];
            }
        }
        System.out.println(answer);
    }
} 
