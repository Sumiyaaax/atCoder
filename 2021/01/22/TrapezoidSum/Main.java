import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] firstNumList = new long[N];
        long[] lastNumList = new long[N];
        for(int i = 0; i < N; i++) {
            firstNumList[i] = sc.nextLong();
            lastNumList[i] = sc.nextLong();
        }
        sc.close();
        long total = 0;
        // これだとTLE↓
        // for(int i = 0; i < N; i++) {
        //     for(int j = firstNumList[i]; j <= lastNumList[i]; j++) {
        //         total += j;
        //     }
        // }
        for(int i = 0; i < N; i++) {
            total += lastNumList[i] * (lastNumList[i] + 1) / 2 - firstNumList[i] * (firstNumList[i] - 1) / 2;
            
        }
        System.out.println(total);
    }
}