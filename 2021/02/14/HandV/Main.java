import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int V = sc.nextInt();
        int K = sc.nextInt();
        char[][] charList = new char[H][V];
        int totalBlack = 0;
        for(int i = 0; i < H; i++) {
            charList[i] = sc.next().toCharArray();
        }
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < V; j++) {
                if(charList[i][j] == '#') {
                    totalBlack ++;
                }
            }
        }
        sc.close();
        for(int i = 0; i < H; i ++) {
            int numOfBlack = totalBlack;
            for(int j = 0; j < V; j++) {
                
            }
        }
    }
}