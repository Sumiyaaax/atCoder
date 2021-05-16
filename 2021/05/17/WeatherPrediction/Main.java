import java.util.Scanner;

public class Main {
    // A - Weather Prediction
    // https://atcoder.jp/contests/abc141/tasks/abc141_a
    public static void main(String[] args) {
        final String SUNNY = "Sunny";
        final String CLOUDY = "Cloudy";
        final String RAINY = "Rainy";
        String answer = "";
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        if(S.equals(SUNNY)) {
            answer = CLOUDY;
        } else if(S.equals(CLOUDY)) {
            answer = RAINY;
        } else {
            answer = SUNNY;
        }
        System.out.println(answer);
    }
} 
