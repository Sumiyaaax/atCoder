import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();sc.close();
        long answer = Math.max(a * c, Math.max(a * d, Math.max(b * c, b * d)));
        System.out.println(answer);
    }
}