import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    //  B - Cycle Hit
    // https://atcoder.jp/contests/abc211/tasks/abc211_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> hitSet = new HashSet<>();
        int n = 4;
        for(int i = 0; i < n; i++) {
            hitSet.add(sc.next());
        }
        sc.close();
        String answer = "No";
        if(hitSet.size() == 4) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
} 
