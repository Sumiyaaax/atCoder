import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // A - Remaining Balls
    // https://atcoder.jp/contests/abc154/tasks/abc154_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> ballMap = new HashMap<>();
        String S = sc.next();
        String T = sc.next();
        ballMap.put(S, sc.nextInt());
        ballMap.put(T, sc.nextInt());
        String U = sc.next();
        sc.close();
        ballMap.replace(U, ballMap.get(U) - 1);
        System.out.println(ballMap.get(S) + " " + ballMap.get(T));
    }
} 