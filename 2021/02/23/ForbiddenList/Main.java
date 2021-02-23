import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // C - Forbidden List
    // https://atcoder.jp/contests/abc170/tasks/abc170_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            numList.add(sc.nextInt());
        }
        sc.close();
        if(N == 0) {
            System.out.println(X);
            return;
        }
        int nearestNum = 100;
        int answer = X;
        for(int i = 0; i <= 101; i++) {
            if(numList.contains(i)) {
                continue;
            }
            if(Math.abs(X - i) < nearestNum) {
                nearestNum = Math.abs(X - i);
                answer = i;
            }
        }
        System.out.println(answer);
    }
}