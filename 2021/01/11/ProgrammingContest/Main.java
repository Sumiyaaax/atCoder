import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // https://atcoder.jp/contests/abc184/tasks/abc184_f
    // 難しすぎるため、いったん断念
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long T = sc.nextLong();
        List<Long> tookTimeList = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            tookTimeList.add(sc.nextLong());
        }
        sc.close();
        long totalTookTime = 0;
        Collections.sort(tookTimeList);
        for(long time : tookTimeList) {
            if(totalTookTime + time <= T) {
                totalTookTime += time;
            }
        }
        System.out.println(totalTookTime);
    }
}