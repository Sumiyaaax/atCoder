import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
    // C - Green Bin
    // https://atcoder.jp/contests/abc137/tasks/abc137_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;
        Map<String, Long> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            char[] tmp = sc.next().toCharArray();
            Arrays.sort(tmp);
            String tmpStr = new String(tmp);
            if(map.containsKey(tmpStr)) {
                long tmpLong = map.get(tmpStr);
                if(tmpLong == 0) {
                    map.replace(tmpStr, (long) 1);
                } else {
                    map.replace(tmpStr, tmpLong + 1);
                }
            } else {
                map.put(tmpStr, (long) 1);
            }
        }
        for(Entry<String, Long> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println(sum);
    }
} 
