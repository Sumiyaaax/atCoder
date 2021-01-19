import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // C - To 3
    // https://atcoder.jp/contests/abc182/tasks/abc182_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();
        char[] numList = String.valueOf(N).toCharArray();
        List<Integer> intList = new ArrayList<>();
        int total = 0;
        for(char c : numList) {
            intList.add(Character.getNumericValue(c));
            total += Character.getNumericValue(c);
        }
        int answer = -1;
        if(total % 3 == 0) {
            answer = 0;
            System.out.println(answer);
            return;
        } else if (total % 3 == 1) {
            remainder1(intList);
        }
    }

    public static int remainder1(List<Integer> intList) {
        if(intList.size() == 1) {
            return -1;
        }
    }
}