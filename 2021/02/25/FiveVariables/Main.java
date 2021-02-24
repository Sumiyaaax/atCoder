import java.util.Scanner;

public class Main {
    // A - Five Variables
    // https://atcoder.jp/contests/abc170/tasks/abc170_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numList = new int[5];
        int answer = 0; 
        for(int i = 0; i < numList.length; i++) {
            numList[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < numList.length; i++) {
            if(numList[i] == 0) {
                answer = i + 1;
                break;
            }
        }
        System.out.println(answer);
    }
}