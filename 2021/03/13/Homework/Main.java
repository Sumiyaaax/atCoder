import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // B - Homework
    // https://atcoder.jp/contests/abc163/tasks/abc163_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < M; i++) {
            numList.add(sc.nextInt());
        }
        sc.close();
        int answer = 0;
        for(int i = 0; i < M; i++) {
            answer += numList.get(i);
            if(answer > N) {
                answer = -1;
                System.out.println(answer);
                return;
            }
        }
        System.out.println(N - answer);
    }
}