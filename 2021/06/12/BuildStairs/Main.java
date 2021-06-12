import java.util.Scanner;

public class Main {
    // C - Build Stairs
    // https://atcoder.jp/contests/abc136/tasks/abc136_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String answer = "Yes";
        int[] numList = new int[N];
        for(int i = 0; i < N; i++) {
            numList[i] = sc.nextInt();
            if(i != 0) {
                System.out.println(numList[i - 1]);
                System.out.println(numList[i]);
                if(numList[i - 1] <= numList[i]) {
                    System.out.println("AAA");
                    continue;
                } else if(numList[i - 1] - 1 <= numList[i]) {
                    System.out.println("BBB");
                    numList[i - 1] --;
                } else {
                    System.out.println("CCC");
                    answer = "No";
                }
            }
        }
        sc.close();
        System.out.println(answer);
    }
} 
