import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    /* 問題文AtCoder 市で市長選挙が行われます
    市には N 個の町があり、i 番目の町には青木派の有権者が Ai 人、高橋派の有権者が Bi 人います
    候補者は青木氏と高橋氏です
    他に有権者はいません
    高橋氏は、それぞれの町で演説を行うことができます
    高橋氏がある町で演説を行った場合、その町の高橋派も青木派も全員高橋氏に投票します
    一方、高橋氏がある町で演説を行わなかった場合、その町の青木派は全員青木氏に投票し、高橋派は投票に行きません
    高橋氏が青木氏より多く票を獲得するためには、最小でいくつの町で演説をする必要があるでしょうか？ */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[][] votes = new long[num][2];
        Long[] sumVotes = new Long[num];
        long result = 0; 
        long takahashiTotal = 0;
        for(int i = 0; i < num; i++) {
            votes[i][0] = sc.nextLong();
            votes[i][1] = sc.nextLong();
            sumVotes[i] = votes[i][0] + votes[i][1];
        }
        Arrays.stream(sumVotes).sorted(Comparator.reverseOrder()).toArray();
        for(int i = 0; i < num; i++) {
            result += 1;
            takahashiTotal = sumVotes[i];
            long aokiTotal = 0;
            for(int j = i + 1; j < num; j++) {
                aokiTotal += votes[j][0];
            }
            if(takahashiTotal > aokiTotal) {
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}