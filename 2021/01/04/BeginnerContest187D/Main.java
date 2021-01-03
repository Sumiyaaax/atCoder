import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> aokiVote = new ArrayList<>();
        List<Integer> takahashiVote = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            aokiVote.add(sc.nextInt());
            takahashiVote.add(sc.nextInt());
        }
        sc.close();
    }
}