import java.util.Scanner;

public class Main {
    // B - Visibility
    // https://atcoder.jp/contests/abc197/tasks/abc197_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int X = sc.nextInt() - 1;
        int Y = sc.nextInt() - 1;
        char[][] S = new char[H][W];
        for(int i = 0; i < H; i++) {
            String tmp = sc.next();
            for(int j = 0; j < W; j++) {
                S[i][j] = tmp.charAt(j);
            }
        }
        sc.close();
        int answer = -3;
        for(int i  = X; i < H; i++) {
            if(S[i][Y] == '.') {
                answer ++;
            }else {
                break;
            }
        }
        for(int i  = X; i >= 0; i--) {
            if(S[i][Y] == '.') {
                answer ++;
            }else {
                break;
            }
        }
        for(int i  = Y; i < W; i++) {
            if(S[X][i] == '.') {
                answer ++;
            }else {
                break;
            }
        }
        for(int i  = Y; i >= 0; i--) {
            if(S[X][i] == '.') {
                answer ++;
            }else {
                break;
            }
        }
        System.out.println(answer);
    }
} 
