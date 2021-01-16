import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        Map<Integer, List<Integer>> timeMap = new HashMap<>();
        for(int i = 0; i < N; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < N; j++) {
                list.add(sc.nextInt());
            }
            timeMap.put(i, list);
        }
        for(Map.Entry<Integer, List<Integer>> entry : timeMap.entrySet()) {
            System.out.println("key:" + entry.getKey() + " value" + entry.getValue());
        }
    }
}