import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // D - Hachi
    // https://atcoder.jp/contests/abc181/tasks/abc181_d
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.next().toCharArray();
        sc.close();
        List<Integer> numList = new ArrayList<>();
        for(char c : array) {
            numList.add(Character.getNumericValue(c));
        }
        if(numList.size() == 1 && numList.get(0) == 8) {
            System.out.println("Yes");
            return;
        }
        String answer = "No";
        for(int i = 0; i < numList.size(); i++) {
            if(divTwo(numList.get(i))) {
                if(checkMultipleOfFour(i, numList.get(i), numList)) {
                    answer = "Yes";
                }
            }
        }
        System.out.println(answer);
    }

    public static boolean divTwo(Integer num) {
        return num % 2 == 0;
    }

    public static boolean checkMultipleOfFour(int i, Integer num, List<Integer> numList) {
        boolean flag = false;
        boolean answer = false;
        int j = 0;
        while(!flag) {
            if(i != j) {
                if((numList.get(j) * 10 + num) % 4 == 0) {
                    flag = true;
                    answer = true;
                } 
            }
            if(j < numList.size()) {
                j++;
            } else {
                flag = true;
            }

        }
        return answer;
    }
}