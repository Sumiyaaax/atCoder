import java.util.Scanner;

public class Main {
    // D - Alter Altar
    // https://atcoder.jp/contests/abc174/tasks/abc174_d
    // 解答：https://img.atcoder.jp/abc174/editorial.pdf
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] stoneList = sc.next().toCharArray();
        sc.close();
        int countRed = 0;
        for(int i = 0; i < N; i++) {
            if(stoneList[i] == 'R') {
                countRed ++;
            }
        }
        if(countRed == 0 || countRed == N) {
            System.out.println(0);
            return;
        }
        int countBadRed = 0;
        int countBadWhite = 0;
        int answer = 0;
        for(int i = 0; i < N; i++) {
            if(countRed > i && stoneList[i] == 'W') {
                countBadWhite ++;
            }
            if(countRed <= i && stoneList[i] == 'R') {
                countBadRed ++;
            }
            // System.out.println("countBadRed " + countBadRed);
            // System.out.println("countBadWhite " + countBadWhite);
            // System.out.println("answer " + answer);
        }
        answer = Math.max(countBadRed, countBadWhite) + Math.abs(countBadRed - countBadWhite);
        System.out.println(answer);
    }
}