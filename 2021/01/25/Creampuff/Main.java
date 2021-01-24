import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    // C - Cream puff
    // https://atcoder.jp/contests/abc180/tasks/abc180_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();
        List<Long> answer = new ArrayList<>();
        for(long i = 1; i * i <= N; i++) {
            if(N % i == 0) {
                answer.add(i);
                if(i != Math.sqrt(N)) {
                    answer.add(N / i);
                }
            }
        }
        Collections.sort(answer);
        answer.forEach(a -> System.out.println(a));
    }
}