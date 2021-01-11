import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    // C - ABC Tournament
    // https://atcoder.jp/contests/abc188/tasks/abc188_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int participants = (int) Math.pow(2, N);
        List<Integer> groupA = new ArrayList<>();
        List<Integer> groupB = new ArrayList<>();
        for(int i = 0; i < participants; i++) {
            if(i + 1 <= participants / 2) {
                groupA.add(sc.nextInt());
            } else {
                groupB.add(sc.nextInt());
            }
        }
        sc.close();
        int secondPlace = 0;
        if(Collections.max(groupA) > Collections.max(groupB)) {
            secondPlace = groupB.indexOf(Collections.max(groupB)) + 1 + groupA.size();
        } else {
            secondPlace = groupA.indexOf(Collections.max(groupA)) + 1;
        }
        System.out.println(secondPlace);
    }
}