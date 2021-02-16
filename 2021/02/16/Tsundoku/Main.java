import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // C - Tsundoku
    // https://atcoder.jp/contests/abc172/tasks/abc172_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        List<Long> tableA = new ArrayList<>();
        List<Long> tableB = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            tableA.add(sc.nextLong());
        }
        for(int i = 0; i < M; i++) {
            tableB.add(sc.nextLong());
        }
        sc.close();
        long answer = 0;
        long leftTime = K;
        for(int i = 0; i < N + M; i++) {
            if(tableA.size() == 0 && tableB.size() == 0) {
                break;
            }
            if(tableA.size() == 0) {
                leftTime -= tableB.get(0);
                // System.out.println("1 : " + leftTime);
                tableB.remove(0);
            } else if(tableB.size() == 0) {
                leftTime -= tableA.get(0);
                // System.out.println("2 : " + leftTime);
                tableA.remove(0);
            } else if(tableA.get(0) > tableB.get(0)) {
                leftTime -= tableB.get(0);
                // System.out.println("3 : " + leftTime);
                tableB.remove(0);
            } else {
                leftTime -= tableA.get(0);
                // System.out.println("4 : " + leftTime);
                tableA.remove(0);
            }
            if(leftTime >= 0) {
                answer ++;
            } else {
                break;
            }
        }
        System.out.println(answer);
    }
}