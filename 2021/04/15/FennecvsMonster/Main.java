import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    // C - Fennec vs Monster
    // https://atcoder.jp/contests/abc153/tasks/abc153_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        List<Long> numList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            numList.add(sc.nextLong());
        }
        sc.close();
        Collections.sort(numList, Collections.reverseOrder());
        long answer = 0L;
        if(numList.size() >= K) {
            for(int i = (int) K; i < numList.size(); i++) {
                answer += numList.get(i);
            }
        }
        System.out.println(answer);
    }
} 
