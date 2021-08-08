import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // B - Weak Password
    // https://atcoder.jp/contests/abc212/tasks/abc212_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] pass = sc.next().toCharArray();
        sc.close();
        String answer = "Strong";
        if(pass[0] == pass[1] && pass[1] == pass[2] && pass[2] == pass[3]) {
            answer = "Weak";
        } else {
            for(int i = 0; i < pass.length - 2; i++) {
                if(pass[i] == '9' && pass[i + 1] == '0') {
                    answer = "Weak";
                    break;
                }
            }
            if(Character.getNumericValue(pass[0]) == Character.getNumericValue(pass[1] + 1) && Character.getNumericValue(pass[1]) == Character.getNumericValue(pass[2]) + 1 && Character.getNumericValue(pass[2]) == Character.getNumericValue(pass[3] + 1)) {
                answer = "Weak";
            }
        }
        System.out.println(answer);
    }
} 
