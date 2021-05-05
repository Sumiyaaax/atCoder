import java.util.Scanner;

public class Main {
    // C - Average Length
    // https://atcoder.jp/contests/abc145/tasks/abc145_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        int[][] positionList = new int[N][2];
        for(int i = 0; i < N; i++) {
            positionList[i][0] = sc.nextInt();
            positionList[i][1] = sc.nextInt();
        }
        sc.close();
        double sum = 0;
        for(int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {
                sum += Math.sqrt(Math.pow(positionList[i][0] - positionList[j][0], 2) + Math.pow(positionList[i][1] - positionList[j][1], 2));
            }
        }
        System.out.println(sum * 2 / N);
    }
} 
