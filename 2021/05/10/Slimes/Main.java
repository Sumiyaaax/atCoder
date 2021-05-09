import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // C - Slimes
    // https://atcoder.jp/contests/abc143/tasks/abc143_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] c = sc.next().toCharArray();
        sc.close();
        List<String> cList = new ArrayList<>();
        cList.add(String.valueOf(c[0]));
        for(int i = 1; i < N; i++) {
            if(c[i - 1] != c[i]) {
                cList.add(String.valueOf(c[i]));
            }
        }
        System.out.println(cList.size());
    }
} 
