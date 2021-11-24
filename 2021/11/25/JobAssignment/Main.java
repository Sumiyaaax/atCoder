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
        int aMin = 10000000;
        int bMin = 10000000;
        int totalMin = 10000000;
        for(int i = 0; i < N; i++) {
            if(aMin > aList.get(i)) {
                aMin = aList.get(i);
            }
            if(bMin > bList.get(i)) {
                bMin = bList.get(i);
            }
            if(totalMin > totalList.get(i)) {
                totalMin = totalList.get(i);
            }
        }
        int answer = Math.max(aMin, bMin);
        System.out.println(answer);
        if(answer > totalMin) {
            answer = totalMin;
        }
        System.out.println(totalMin);
    }
} 
