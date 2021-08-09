import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // C - Min Difference
    // https://atcoder.jp/contests/abc212/tasks/abc212_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nList = new int[N];
        int[] mList = new int[M];
        for(int i = 0; i < N; i++) {
            nList[i] = sc.nextInt();
        }
        for(int i = 0; i < M; i++) {
            mList[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(nList);
        Arrays.sort(mList);
        int nCount = 0;
        int mCount = 0;
        int answer = Integer.MAX_VALUE;
        while(nCount < N && mCount < M) {
            answer = Math.min(answer, Math.abs(nList[nCount] - mList[mCount]));
            if(nList[nCount] < mList[mCount]) {
                nCount++;
            } else {
                mCount++;
            }
        }
        System.out.println(answer);
    }
} 
