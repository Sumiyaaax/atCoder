import java.util.Scanner;

public class Main {
/*     問題文日本でよく使われる紙幣は、10000 円札、5000 円札、1000 円札です。
        以下、「お札」とはこれらのみを指します。
        青橋くんが言うには、彼が祖父から受け取ったお年玉袋にはお札が N 枚入っていて、合計で Y 円だったそうですが、嘘かもしれません。
        このような状況がありうるか判定し、ありうる場合はお年玉袋の中身の候補を一つ見つけてください。
        なお、彼の祖父は十分裕福であり、お年玉袋は十分大きかったものとします。
        制約1≤N≤20001000≤Y≤2×107N は整数である。
        Y は 1000 の倍数である。
 */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int MINUS_ONE = -1;
        sc.close();
        for(int i = 0; i <= N; i++) {
            for(int j = 0; j <= N - i; j++) {
                int k = N - i -j;
                if(10000 * i + 5000 * j + 1000 * k  == Y) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }
        System.out.println(MINUS_ONE + " " + MINUS_ONE + " " + MINUS_ONE);
    }
}