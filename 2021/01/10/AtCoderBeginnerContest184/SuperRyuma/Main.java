import java.util.Scanner;

public class Main {
    /*     問題文無限に広がる 2 次元グリッドがあり、マス (r1,c1) に駒「超竜馬」が置かれています。
    この駒は、 1 手で次のような動きができます。
    より正確には、超竜馬がマス (a,b) にあるとき、以下のいずれかの条件を満たすマス (c,d) に動かすことができます。
    a+b=c+d
    a−b=c−d
    |a−c|+|b−d|≤3
    超竜馬を (r1,c1) から (r2,c2) に動かすのに必要な最小手数を求めてください。
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        sc.close();
        if(r1 == r2 && c1 == c2) {
            System.out.println(0);
            return;
        }
        if(checkAction1(r1, c1, r2, c2)) {
            System.out.println(1);
            return;
        }
        if(checkAction2(r1, c1, r2, c2)) {
            System.out.println(2);
            return;
        }
        System.out.println(3);

    }
    public static boolean checkAction1(int r1, int c1, int r2, int c2) {
        if(r1 + c1 == r2 + c2) {
            return true;
        }
        if(r1 - c1 == r2 - c2) {
            return true;
        }
        if(Math.abs(r1 - r2) + Math.abs(c1 - c2) <= 3) {
            return true;
        }
        return false;
    }
    public static boolean checkAction2(int r1, int c1, int r2, int c2) {
        if((r1 + c1 + r2 + c2) % 2 == 0) {
            return true;
        }
        if(Math.abs((r1 + c1) - (r2 + c2)) <= 3) {
            return true;
        }
        if(Math.abs((r1 - c1) - (r2 - c2)) <= 3) {
            return true;
        }
        if(Math.abs(r1 - r2) + Math.abs(c1 - c2) <= 6) {
            return true;
        }
        return false;
    }
}