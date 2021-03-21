import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // C - Traveling Salesman around Lake
    // https://atcoder.jp/contests/abc160/tasks/abc160_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] housePositions = new int[N];
        for(int i = 0; i < N; i++) {
            housePositions[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(housePositions);
        int maxDistance = 0;
        for(int i = 0; i < N - 1; i++) {
            if(maxDistance < housePositions[i + 1] - housePositions[i]) {
                maxDistance = housePositions[i + 1] - housePositions[i];
            }
        }
        if((K - housePositions[N - 1]) + housePositions[0] > maxDistance) {
            maxDistance = (K - housePositions[N - 1]) + housePositions[0];
        }
        System.out.println(K - maxDistance);
    }
}