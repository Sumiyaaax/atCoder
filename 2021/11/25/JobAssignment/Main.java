import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // B - Job Assignment
    // https://atcoder.jp/contests/abc194/tasks/abc194_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        List<Integer> totalList = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            aList.add(a);
            bList.add(b);
            totalList.add(a + b);
        }
        sc.close();
        int min = 10000000;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int tempTotal;
                if(i == j) {
                    tempTotal = aList.get(i) + bList.get(j);
                } else {
                    tempTotal = Math.max(aList.get(i), bList.get(j));
                }
                if(min > tempTotal) {
                    min = tempTotal;
                }
            }
        }
        System.out.println(min);
    }
} 
