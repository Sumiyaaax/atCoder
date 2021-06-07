import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // B - One Clue
    // https://atcoder.jp/contests/abc137/tasks/abc137_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        sc.close();
        List<Integer> numList = new ArrayList<>();
        for(int i = 1; i <= K - 1; i++) {
            numList.add(X - K + i);
        }
        numList.add(X);
        for(int i = 1; i <= K - 1; i++) {
            numList.add(X + i);
        }
        for(Integer i : numList) {
            System.out.print(i + " ");
        }
    }
} 
