import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // C - Step
    // https://atcoder.jp/contests/abc176/tasks/abc176_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        List<Long> numList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            numList.add(sc.nextLong());
        }
        sc.close();
        long total = 0;
        for(int i = 1; i < numList.size(); i++) {
            long first = numList.get(i - 1);
            long second = numList.get(i);

            if(first > second) {
                total += first - second;
                numList.set(i, first);
            }
        }
        System.out.println(total);
    }
}