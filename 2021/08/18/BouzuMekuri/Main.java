import java.util.Scanner;

public class Main {
    // B - Bouzu Mekuri
    // https://atcoder.jp/contests/abc210/tasks/abc210_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] charS = sc.next().toCharArray();
        sc.close();
        String answer = "";
        for(int i = 0; i < N; i++) {
            if(i == 0 || i % 2 == 0) {
                if(charS[i] == '1') {
                    answer = "Takahashi";
                    break;
                }
            } else {
                if(charS[i] == '1') {
                    answer = "Aoki";
                    break;
                }
            }
        }
        System.out.println(answer);
    }
} 
