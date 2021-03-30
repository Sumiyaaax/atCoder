import java.util.Scanner;

public class Main {
    // B - Bingo    
    // https://atcoder.jp/contests/abc157/tasks/abc157_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numList = new int[3][3];
        boolean[][] isPickedList = new boolean[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                numList[i][j] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        for(int k = 0; k < N; k++) {
            int tmp = sc.nextInt();
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(numList[i][j] == tmp) {
                        isPickedList[i][j] = true;
                    }
                }
            }
        }
        sc.close();
        String answer = "No";
        for(int i = 0; i < 3; i++) {
            if(isPickedList[i][0] && isPickedList[i][1] && isPickedList[i][2]) {
                answer = "Yes";
                break;
            }
        }
        for(int i = 0; i < 3; i++) {
            if(isPickedList[0][i] && isPickedList[1][i] && isPickedList[2][i]) {
                answer = "Yes";
                break;
            }
        }
        
        if(isPickedList[0][0] && isPickedList[1][1] && isPickedList[2][2]) {
            answer = "Yes";
        }
        if(isPickedList[0][2] && isPickedList[1][1] && isPickedList[2][0]) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
}