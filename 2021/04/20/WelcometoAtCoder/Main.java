import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    // C - Welcome to AtCoder
    // https://atcoder.jp/contests/abc151/tasks/abc151_c
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int corrctAnswer = 0;
        int wrongAnswer = 0;
        Set<Integer> finQuestionList = new HashSet<>();
        Map<Integer, Integer> counnWrongAnsMap = new HashMap<>();
        for(int i = 0; i < M; i++) {
            int questionNo = sc.nextInt();
            String result = sc.next();
            if(finQuestionList.contains(questionNo)) {
                continue;
            }
            if(result.equals("AC")) {
                corrctAnswer ++;
                finQuestionList.add(questionNo);
            } else {
                if(!counnWrongAnsMap.containsKey(questionNo)) {
                    counnWrongAnsMap.put(questionNo, 1);
                } else {
                    counnWrongAnsMap.replace(questionNo, counnWrongAnsMap.get(questionNo) + 1);
                }
            }
        }
        for(Map.Entry<Integer, Integer> entry : counnWrongAnsMap.entrySet()) {
            if(finQuestionList.contains(entry.getKey())) {
                wrongAnswer += entry.getValue();
            }
        }
        sc.close();
        System.out.println(corrctAnswer + " " + wrongAnswer);
    }
} 
