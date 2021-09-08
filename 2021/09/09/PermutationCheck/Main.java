import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // B - Permutation Check
    // https://atcoder.jp/contests/abc205/tasks/abc205_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numList = new int[N];
        for(int i = 0; i < N; i++) {
            numList[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(numList);
        String answer = "Yes";
        for(int i = 0; i < N; i++) {
            if(numList[i] != i + 1) {
                answer = "No";
                break;
            }
        }
        System.out.println(answer);
    }
} 
