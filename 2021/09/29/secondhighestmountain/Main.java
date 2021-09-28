import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    // B - Do you know the second highest mountain?
    // https://atcoder.jp/contests/abc201/tasks/abc201_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, String> mountainMap = new TreeMap<>();
        for(int i = 0; i < N; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            mountainMap.put(height, name);
        }
        sc.close();
        List<String> mountainNames = new ArrayList<>();
        for(String n : mountainMap.values()) {
            mountainNames.add(n);
        }
        System.out.println(mountainNames.get(mountainNames.size() - 2));
    }
} 
