import java.util.Scanner;

public class Main {
    // 問題文すぬけ君は 1,2,3 の番号がついた 3 つのマスからなるマス目を持っています。 
    // 各マスには 0 か 1 が書かれており、マス i には si が書かれています。
    // すぬけ君は 1 が書かれたマスにビー玉を置きます。
    // ビー玉が置かれるマスがいくつあるか求めてください。制約s1,s2,s3 は 1 あるいは 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] charStr = str.toCharArray();
        int counter = 0;
        for(char c : charStr) {
            if(c == '1') {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}