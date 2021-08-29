import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // A - Repression
    // https://atcoder.jp/contests/abc207/tasks/abc207_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numList = new int[3];
        numList[0] = sc.nextInt();
        numList[1] = sc.nextInt();
        numList[2] = sc.nextInt();
        sc.close();
        Arrays.sort(numList);
        System.out.println(numList[1] + numList[2]);
    }
} 
