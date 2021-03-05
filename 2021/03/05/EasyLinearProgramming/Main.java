import java.util.Scanner;

public class Main {
    // B - Easy Linear Programming
    // https://atcoder.jp/contests/abc167/tasks/abc167_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] cards = new long[3];
        cards[0] = sc.nextLong();
        cards[1] = sc.nextLong();
        cards[2] = sc.nextLong();
        long K = sc.nextLong();
        sc.close();
        long answer = 0;
        for(int j = 0; j < cards.length; j++) {
            if(K >= cards[j] && j == 0) {
                answer += cards[j];
                K -= cards[j];
            } else if(K < cards[j] && j == 0) {
                answer += K;
                break;
            } else if(K >= cards[j] && j == 1) {
                K -= cards[j];
            } else if(K < cards[j] && j == 1) {
                break;
            } else if(K >= cards[j] && j == 2) {
                answer += -1 * cards[j];
                K -= cards[j];
            } else if(K < cards[j] && j == 2) {
                answer += -1 * K;
                break;
            }
        }
        System.out.println(answer);
    }
}