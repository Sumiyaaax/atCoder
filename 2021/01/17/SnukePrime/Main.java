import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // D - Snuke Prime
    // https://atcoder.jp/contests/abc188/tasks/abc188_d
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long C = sc.nextLong();
        long[][] daily = new long[N][3];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 3; j++) {
                daily[i][j] = sc.nextLong();
            }
        }
        Map<Long, Long> dailyTotal = new HashMap<>();
        for(int i = 0; i < N; i++) {
            for(long j = daily[i][0]; j <= daily[i][1]; j++) {
                if(i == 0) {
                    dailyTotal.put(j, daily[i][2]); 
                } else {
                    if(dailyTotal.containsKey(j)) {
                        dailyTotal.replace(j, dailyTotal.get(j) + daily[i][2]);
                    } else {
                    dailyTotal.put(j, daily[i][2]);
                    }
                }
            }
        }
        long result = 0L;
        for(Map.Entry<Long, Long> d : dailyTotal.entrySet()) {
            if(d.getValue() >= C) {
                result += C;
            } else {
                result+= d.getValue();
            }
        }
        System.out.println(result);
    }
}