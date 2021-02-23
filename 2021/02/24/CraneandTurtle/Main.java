import java.util.Scanner;

public class Main {
    // B - Crane and Turtle
    // https://atcoder.jp/contests/abc170/tasks/abc170_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();
        String answer = "No";
        for(int i = 0; i <= X; i++) {
            if(i * 2 + (X - i) * 4 == Y) {
                answer = "Yes";
                break;
            }
        }
        System.out.println(answer);
    }
}