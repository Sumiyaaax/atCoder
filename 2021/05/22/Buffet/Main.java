import java.util.Scanner;

public class Main {
    // B - Buffet
    // https://atcoder.jp/contests/abc140/tasks/abc140_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Alist = new int[N];
        int[] Blist = new int[N];
        int[] Clist = new int[N - 1];
        int totalSatisfaction = 0;
        for(int i = 0; i < N; i++) {
            Alist[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            Blist[i] = sc.nextInt();
            totalSatisfaction += Blist[i];
        }
        for(int i = 0; i < N - 1; i++) {
            Clist[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < N - 1; i++) {
            if(Alist[i] == Alist[i + 1] - 1) {
                totalSatisfaction += Clist[Alist[i] - 1];
            }
        }
        System.out.println(totalSatisfaction);
    }
} 
