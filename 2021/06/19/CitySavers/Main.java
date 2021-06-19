import java.util.Scanner;
// 解くのが面倒くさくなったので途中
public class Main {
    // C - City Savers
    // https://atcoder.jp/contests/abc135/tasks/abc135_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cityList = new int[N + 1];
        int[] braveManList = new int[N];
        int answer = 0;
        for(int i = 0; i < cityList.length; i++) {
            cityList[i] = sc.nextInt();
        }
        for(int i = 0; i < braveManList.length; i++) {
            braveManList[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < braveManList.length; i++) {
            int tmp = min(cityList[i], braveManList[i]);
            cityList[i] -= tmp;
            braveManList[i] -= tmp;
        }
    }
} 
