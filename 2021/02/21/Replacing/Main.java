import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // D - Replacing
    // https://atcoder.jp/contests/abc171/tasks/abc171_c
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        Map<Long, Long> numMap = new HashMap<>();
        long tmp = 0L;
        long total = 0L;
        for(int i = 0; i < N; i++) {
            tmp = sc.nextLong();
            total += tmp;
            if(numMap.containsKey(tmp)) {
                numMap.replace(tmp, numMap.get(tmp) + 1);
            } else {
                numMap.put(tmp, 1L);
            }
        }
        long Q = sc.nextLong();
        long sum = total;
        for(int i = 0; i < Q; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(numMap.containsKey(a)) {
                sum += (b - a) * numMap.get(a);
                if(numMap.containsKey(b)) {
                    numMap.replace(b, numMap.get(b) + numMap.get(a));
                } else {
                    numMap.put(b, numMap.get(a));
                }
                numMap.remove(a);
            }
            System.out.println(sum);
        }
        sc.close();
        // ↓だとTLE
        // long Q = sc.nextLong();
        // for(int i = 0; i < Q; i++) {
        //     long a = sc.nextLong();
        //     long b = sc.nextLong();
        //     long sum = 0;
        //     for(int j = 0; j < N; j++) {
        //         if(numArray.get(j) == a) {
        //             numArray.set(j, b);
        //         }
        //         // System.out.println(numArray.get(j));
        //         sum += numArray.get(j);
        //     }
        //     System.out.println(sum);
        // }
        
    }
}