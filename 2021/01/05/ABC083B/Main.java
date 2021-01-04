import java.util.Scanner;

public class Main {
    /* 問題文1 以上 N 以下の整数のうち、10 進法での各桁の和が A 以上 B 以下であるものの総和を求めてください。
    制約1≤N≤1041≤A≤B≤36入力はすべて整数である */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int min = sc.nextInt();
        int max = sc.nextInt();
        int result = 0;
        for(int i = 1; i <= num1; i++) {
            char[] num2 = String.valueOf(i).toCharArray();;
            int total = 0;
            for(int j = 0; j < num2.length; j++) {
                total += Character.getNumericValue(num2[j]);
            }
            if(min <= total && total <= max) {
                result += i;
            }
        }
        System.out.println(result);
        sc.close();
    }
}