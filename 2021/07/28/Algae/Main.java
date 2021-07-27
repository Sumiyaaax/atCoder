import java.util.Scanner;

public class Main {
    // B - Algae
    // https://atcoder.jp/contests/abc127/tasks/abc127_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        sc.close();
        int[] answerList = new int[10];
        for(int i = 0; i < answerList.length; i++) {
            if(i == 0) {
                answerList[i] = r * x - d;
            } else {
                answerList[i] = r * answerList[i - 1] - d;
            }
        }
        for(int a : answerList) {
            System.out.println(a);
        }
    }
} 
