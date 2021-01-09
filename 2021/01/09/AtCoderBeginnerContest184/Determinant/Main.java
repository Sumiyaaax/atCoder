import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /* 問題文2×2 行列 A=[abcd] が与えられます。
    A の行列式は ad−bc で求められます。
    A の行列式を求めてください。
    制約入力は全て整数−100≤a,b,c,d≤100 */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 2;
        int length = 2;
        String[][] queue = new String[count][length];
        for(int i = 0; i < count; i++) {
            try {
                queue[i] = br.readLine().split(" ");
            } catch(IOException e) {
                e.printStackTrace();
            }
        } 
        int ad = (Integer.parseInt(queue[0][0])) * (Integer.parseInt(queue[1][1]));
        int bc = (Integer.parseInt(queue[0][1])) * (Integer.parseInt(queue[1][0]));
        System.out.println(ad - bc);
    }
}