import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // C - Attack Survival
    // https://atcoder.jp/contests/abc141/tasks/abc141_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        Map<Integer, Integer> answerMap = new HashMap<>();
        for(int i = 0; i < Q; i++) {
            int tmp = sc.nextInt();
            if(answerMap.containsKey(tmp)) {
                answerMap.replace(tmp, answerMap.get(tmp) + 1);
            } else {
                answerMap.put(tmp, 1);
            }
        }
        sc.close();
        for(int i = 1; i <= N; i++) {
            if(answerMap.containsKey(i)) {
                if(K - (Q - answerMap.get(i)) <= 0) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            } else {
                if(K - Q <= 0) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        }
    }
} 
