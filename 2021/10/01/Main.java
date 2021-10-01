import java.util.Scanner;
import java.util.Arrays;

public class Main {
    // A - Tiny Arithmetic Sequence
    // https://atcoder.jp/contests/abc201/tasks/abc201_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 3;
        int[] numList = new int[N];
        for(int i = 0; i < N; i++) {
            numList[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(numList);
        String answer = "No";
        if(numList[2] - numList[1] == numList[1] - numList[0]) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
} 
