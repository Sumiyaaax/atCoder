import java.io.*;

public class Main {
    /* 問題文高橋くんは、 N 問のクイズに答えます。
        高橋くんの持っている点数ははじめ X 点で、クイズに正解すると 1 点増え、不正解だと 1 点減ります。
        ただし、持っている点数が 0 点のときに不正解となった場合は点数は減りません。
        高橋くんのクイズの結果が文字列 S で与えられます。
        S の左から i 番目の文字が o のとき、 i 問目が正解だったことを、 x のとき、 i 問目が不正解だったことを表します。
        高橋くんの最終的な点数はいくつでしょうか？制約1≤N≤2×1050≤X≤2×105S は o と x からなる長さ N の文字列 */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String[] NX = new String[2];
        String S = "";
        try {
            NX = br.readLine().split(" ");
            S = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int score = Integer.parseInt(NX[1]);
        char[] c = S.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if(c[i] == 'o') {
                score += 1;
            } else if(c[i] == 'x' && score > 0) {
                score -= 1;
            }
        }
        System.out.println(score);
    }
}