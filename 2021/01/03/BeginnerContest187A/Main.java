import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num1 = sc.next().toCharArray();
        char[] num2 = sc.next().toCharArray();
        int num1Total = getTotal(num1);
        int num2Total = getTotal(num2);
        if(num1Total >= num2Total) {
            System.out.println(num1Total);
        } else {
            System.out.println(num2Total);
        }
        sc.close();
    }

    public static int getTotal(char[] num) {
        int numTotal = 0;
        for(char n : num) {
            numTotal += Character.getNumericValue(n);
        }
        return numTotal;
    }
}