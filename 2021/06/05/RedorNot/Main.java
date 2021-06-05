import java.util.Scanner;

public class Main {
    // A - Red or Not
    // https://atcoder.jp/contests/abc138/tasks/abc138_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        sc.close();
        String answer;
        if(a >= 3200) {
            answer = s;
        } else {
            answer = "red";
        }
        System.out.println(answer);
    }
} 
