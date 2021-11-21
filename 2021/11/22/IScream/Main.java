import java.util.Scanner;

public class Main {
    // A - I Scream
    // https://atcoder.jp/contests/abc194/tasks/abc194_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int answer = 4;
        if(A + B >= 15 && B >= 8) {
            answer = 1;
        } else if(A + B >= 10 && B >= 3) {
            answer = 2;
        } else if(A + B >= 3) {
            answer = 3;
        }
        System.out.println(answer);
    }
} 
