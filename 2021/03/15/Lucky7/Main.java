import java.util.Scanner;

public class Main {
    // A - Lucky 7
    // https://atcoder.jp/contests/abc162/tasks/abc162_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        String answer = "No";
        for(int i = 0; i < 3; i++) {
            if(String.valueOf(num).substring(i, i + 1).equals("7")) {
                answer = "Yes";
                break;
            }
        }
        System.out.println(answer);
    }
}