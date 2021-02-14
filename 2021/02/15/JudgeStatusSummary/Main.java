import java.util.Scanner;

public class Main {
    // B - Judge Status Summary
    // https://atcoder.jp/contests/abc173/tasks/abc173_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int countAC = 0;
        int countWA = 0;
        int countTLE = 0;
        int countRE = 0;
        for(int i = 0; i < N; i++) {
            String tmp = sc.next();
            if(tmp.equals("AC")) {
                countAC ++;
            } else if(tmp.equals("WA")) {
                countWA ++;
            } else if(tmp.equals("TLE")) {
                countTLE ++;
            } else {
                countRE ++;
            }
        }
        sc.close();
        System.out.println("AC x " + countAC);
        System.out.println("WA x " + countWA);
        System.out.println("TLE x " + countTLE);
        System.out.println("RE x " + countRE);
    }
}