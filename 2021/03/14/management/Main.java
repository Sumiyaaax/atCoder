import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // C - management
    // https://atcoder.jp/contests/abc163/tasks/abc163_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> empMap  = new HashMap<>();
        for(int i = 0; i < N - 1; i++) {
            int tmp = sc.nextInt();
            if(empMap.containsKey(tmp)) {
                empMap.put(tmp, empMap.get(tmp) + 1);
            } else {
                empMap.put(tmp, 1);
            }
        }
        sc.close();
        for(int i = 1; i <= N; i++) {
            if(empMap.containsKey(i)) {
                System.out.println(empMap.get(i));
            } else {
                System.out.println(0);
            }
        }
    }
} 