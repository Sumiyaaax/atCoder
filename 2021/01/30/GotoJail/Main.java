import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        boolean flag = false;
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == b) {
                count += 1;
                if(count >= 3) {
                    flag = true;
                }
            } else {
                count = 0;
            }
        }
        sc.close();
        if(flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}