import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // A - Maxi-Buying
    // https://atcoder.jp/contests/abc206/tasks/abc206_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        double tax = 1.08;
        double price = (double) N * tax;
        double listPrice = 206;
        String answer = "";
        if(price < listPrice) {
            answer = "Yay!";
        } else if(price == listPrice) {
            answer = "so-so";
        } else {
            answer = ":(";
        }
        System.out.println(answer);
    }
} 
