import java.util.Scanner;

public class Main {
    /*     問題文英小文字からなる文字列 S が与えられます。
            Tが空文字列である状態から始め、以下の操作を好きな回数繰り返すことで S=T とすることができるか判定してください。
            T の末尾に dream dreamer erase eraser のいずれかを追加する。
            制約1≦|S|≦105S は英小文字からなる。
    */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        while(S != null && S.length() > 0) {
            S = checkStartWith(S);
        }
        System.out.println("YES");
    }

    public static String checkStartWith(String S) {
        String[] templates = {"dreameraser", "dreamerase", "dreamer", "dream", "eraser", "erase"};
        for(int i = 0; i < templates.length; i++) {
            if(S.startsWith(templates[i])) {
                return S.substring(templates[i].length());
            }
        }
        System.out.println("NO");
        System.exit(0);
        return "";
    }
}