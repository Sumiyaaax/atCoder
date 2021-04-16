import java.util.Scanner;

public class Main {
    // A - AC or WA
    // https://atcoder.jp/contests/abc152/tasks/abc152_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
} 
