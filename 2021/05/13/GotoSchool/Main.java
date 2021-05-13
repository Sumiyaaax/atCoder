import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // C - Go to School
    // https://atcoder.jp/contests/abc142/tasks/abc142_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < N; i++) {
            numMap.put(sc.nextInt(), i + 1);
        }
        sc.close();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < N; i++) {
            sb.append(numMap.get(i) + " ");
        }
        sb.append(numMap.get(N));
        System.out.println(sb.toString());
    }
} 
