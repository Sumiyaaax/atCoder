import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
    // C - Friends and Travel costs
    // https://atcoder.jp/contests/abc203/tasks/abc203_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        Map<Long, Long> numMap = new HashMap<>();
        for(int i = 0; i < N; i++) {
            long num1 = sc.nextLong();
            long num2 = sc.nextLong();
            if(numMap.containsKey(num1)) {
                numMap.replace(num1, numMap.get(num1) + num2);
            } else {
                numMap.put(num1, num2);
            }
        }
        sc.close();
        long currentVillage = 0;
        while(K > 0) {
            K --;
            currentVillage ++;
            if(numMap.containsKey(currentVillage)) {
                K += numMap.get(currentVillage);
            }
        }
        System.out.println(currentVillage);
    }
} 
