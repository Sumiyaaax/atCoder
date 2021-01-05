import java.util.Arrays;
import java.util.Scanner;

public class Main {
/*     問題文N 枚のカードがあります。
 i 枚目のカードには, ai という数が書かれています。
 Alice と Bob は, これらのカードを使ってゲームを行います。
 ゲームでは, Alice と Bob が交互に 1 枚ずつカードを取っていきます。
 Alice が先にカードを取ります。
 2 人がすべてのカードを取ったときゲームは終了し, 取ったカードの数の合計がその人の得点になります。
 2 人とも自分の得点を最大化するように最適な戦略を取った時, Alice は Bob より何点多く取るか求めてください。
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cards = new int[N];
        int aliceSum = 0;
        int bobSum = 0;
        for(int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);
        int[] cardsSortedDesc = sortDesc(cards);
        for(int i = 0; i < cardsSortedDesc.length; i++) {
            if(i % 2 == 0) {
                aliceSum += cardsSortedDesc[i];
            } else {
                bobSum += cardsSortedDesc[i];
            }
        }
        System.out.println(aliceSum - bobSum);
        sc.close();
    }

    public static int[] sortDesc(int[] cards) {
        int[] cardsSortedDesc = new int[cards.length];
        for(int i = 0; i < cards.length; i++) {
            cardsSortedDesc[i] = cards[cards.length - 1 - i];
        }
        return cardsSortedDesc;
    }
}