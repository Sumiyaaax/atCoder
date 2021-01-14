import java.util.Scanner;

public class Main {
    // B - Billiards
    // https://atcoder.jp/contests/abc183/tasks/abc183_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Sx = sc.nextInt();
        int Sy = sc.nextInt();
        int Gx = sc.nextInt();
        int Gy = sc.nextInt();
        int dx = Gx - Sx; 
        int dy = -Gy - Sy;
        double slopeOnaGraph =  dy / dx;
        double intercept = Sy - slopeOnaGraph * Sx;
        double x = -intercept / slopeOnaGraph;
        System.out.println(x);
        sc.close();
    }
}