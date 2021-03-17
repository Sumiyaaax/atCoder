import java.util.Scanner;

public class Main {
    // B - Popular Vote
    // https://atcoder.jp/contests/abc161/tasks/abc161_b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] productList = new int[N];
        int totalVote = 0;
        int numOfPopularproduct = 0;
        for(int i = 0; i < N; i++) {
            productList[i] = sc.nextInt();
            totalVote += productList[i];
        }
        sc.close();
        double criteria = 4 * M;
        for(int i = 0; i < N; i++) {
            if(productList[i] >= totalVote / criteria) {
                numOfPopularproduct ++;
            }
        }
        String answer = "No";
        if(numOfPopularproduct >= M) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
}