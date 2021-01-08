import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        int N = sc.nextInt();
        List<Town> townList = new LinkedList<>();
        long aokiTotal = 0;
        for(int i = 0; i < N; i++) {
            long aokiSupporters = sc.nextLong();
            long takahashiSupporters = sc.nextLong();
            aokiTotal += aokiSupporters;
            townList.add(new Town(aokiSupporters, takahashiSupporters));
        }
        sc.close();
        Comparator<Town> comparator = Comparator.comparing(Town::getDiff).reversed();
        townList = townList.stream().sorted(comparator).collect(Collectors.toList());
        int result = 1;
        long takahashiTotal = 0;
        // for 文で処理 処理が遅くエラーとなるため使用不可
        // for(int i = 0; i < N; i++) {
        //     long aokiTotal = 0;
        //     takahashiTotal += townList.get(i).getTotalSupporters();
        //     for(int j = 0; j < N; j++) {
        //         if(j + 1 < N && j >= i) {
        //             aokiTotal += townList.get(j + 1).getAokiSupporters();
        //         }
        //     }
        //     if(takahashiTotal > aokiTotal) {
        //         System.out.println(result);
        //         return;
        //     } 
        //     result += 1;
        // }
        // 拡張for文で処理
        for(Town town : townList) {
            takahashiTotal += town.getTotalSupporters();
            aokiTotal -= town.getAokiSupporters();
            if(takahashiTotal > aokiTotal) {
                System.out.println(result);
                return;
            } 
            result += 1;
        }
    }
    static class Town {
        long aokiSupporters = 0;
        long takahashiSupporters = 0;
        long totalSupporters = 0;
        long diff = 0;
        public Town(long aokiSupporters, long takahashiSupporters) {
            this.aokiSupporters = aokiSupporters;
            this.takahashiSupporters = takahashiSupporters;
            this.totalSupporters = aokiSupporters + takahashiSupporters;
            this.diff = aokiSupporters + aokiSupporters + takahashiSupporters;
        }

        public long getAokiSupporters() {
            return this.aokiSupporters;
        }
        public long getTakahashiSupporters() {
            return this.takahashiSupporters;
        }
        public long getTotalSupporters() {
            return this.totalSupporters;
        }
        public long getDiff() {
            return this.diff;
        }
    }
}