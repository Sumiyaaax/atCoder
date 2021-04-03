import java.util.Scanner;

public class Main {
    // A - Poor
    // https://atcoder.jp/contests/abc155/tasks/abc155_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        sc.close();
        String answer = "No";
        if(A.equals(B) && B.equals(C)) {
            System.out.println(answer);
            return;
        } else if(A.equals(B) || B.equals(C) || C.equals(A)) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
} 