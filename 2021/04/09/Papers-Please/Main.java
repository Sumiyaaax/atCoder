import java.util.Scanner;

public class Main {
    // B - Papers, Please
    // https://atcoder.jp/contests/abc155/tasks/abc155_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String answer = "APPROVED";
        int[] numList = new int[N];
        for(int i = 0; i < N; i++) {
            numList[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            if(numList[i] % 2 == 0 && numList[i] % 3 != 0 && numList[i] % 5 != 0) {
                answer = "DENIED";
                break;
            }
        }
        sc.close();
        System.out.println(answer);
    }
} 