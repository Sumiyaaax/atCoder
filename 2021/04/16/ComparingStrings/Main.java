import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // B - Comparing Strings
    // https://atcoder.jp/contests/abc152/tasks/abc152_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        StringBuilder sba = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        for(int i = 0; i < b; i++) {
            sba.append(a);
        } 
        for(int i = 0; i < a; i++) {
            sbb.append(b);
        } 
        String[] numList = {sba.toString(), sbb.toString()};
        Arrays.sort(numList);
        System.out.println(numList[0]);
    }
} 
