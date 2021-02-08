import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // B - Making Triangle
    // https://atcoder.jp/contests/abc175/tasks/abc175_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        List<Long> numList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            numList.add(sc.nextLong());
        }
        sc.close();
        long answer = 0;
        for(int i = 0; i + 2 < N; i++) {
            for(int j = i + 1; j + 1 < N; j++) {
                for(int k = j + 1; k < N; k++) {
                    if(numList.get(i) == numList.get(j) || numList.get(i) == numList.get(k) || numList.get(j) == numList.get(k)) {
                        continue;
                    }
                    if(numList.get(i) < numList.get(j) + numList.get(k) && numList.get(j) < numList.get(i) + numList.get(k) && numList.get(k) < numList.get(i) + numList.get(j)) {
                        answer ++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}