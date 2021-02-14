import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int V = sc.nextInt();
        int K = sc.nextInt();
        char[][] charList = new char[H][V];
        int totalBlack = 0;
        List<Integer> horizontalList = new ArrayList<>(); 
        List<Integer> verticalList = new ArrayList<>();
        for(int i = 0; i < H; i++) {
            charList[i] = sc.next().toCharArray();
            int countBlack = 0;
            for(int j = 0; j < V; j++) {
                if(charList[i][j] == '#') {
                    totalBlack ++;
                    countBlack ++;
                }
            }
            horizontalList.add(countBlack);
        }
        System.out.println("totalBlak" + totalBlack);
        horizontalList.forEach(h -> System.out.println("h " + h));
        for(int i = 0; i < V; i++) {
            int countBlack = 0;
            for(int j = 0; j < H; j++) {
                if(charList[j][i] == '#') {
                    countBlack ++;
                }
            }
            verticalList.add(countBlack);
        }
        verticalList.forEach(v -> System.out.println("v " + v));
        int answer = 0;
        if(H >= V) {
            for(int i = 0; i < H; i++) {
                for(int j = 0; j < H; j++) {
                    if(charList[i][j] == '#') {
                        if(totalBlack - horizontalList.get(i) + verticalList.get(j) - 1 == K) {
                            answer ++;
                        }
                    } else {
                        if(totalBlack - horizontalList.get(i) + verticalList.get(j) == K) {
                            answer ++;
                        }
                    }
                }
            }
        } else {
            for(int i = 0; i < V; i++) {
                for(int j = 0; j < V; j++) {
                        if(j > horizontalList.size()) {
                            if(totalBlack - verticalList.get(i) == K) {
                                System.out.println(i + " " + j);
                                answer ++;
                            }    
                        } else {
                            if(charList[i][j] == '#') {
                                if(totalBlack - horizontalList.get(j) + verticalList.get(i) - 1 == K) {
                                    System.out.println(i + " " + j);
                                    answer ++;
                                }
                            } else {
                                if(totalBlack - horizontalList.get(j) + verticalList.get(i) == K) {
                                    System.out.println(i + " " + j);
                                    answer ++;
                                }
                            }
                        }
                }
            }
        }
         
        sc.close();
        System.out.println(answer);

    }
}