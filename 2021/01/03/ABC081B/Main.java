import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /* 問題文
    黒板に N 個の正の整数 A1,...,AN が書かれています.
    すぬけ君は，黒板に書かれている整数がすべて偶数であるとき，次の操作を行うことができます.
    黒板に書かれている整数すべてを，2 で割ったものに置き換える.
    すぬけ君は最大で何回操作を行うことができるかを求めてください.
    制約1≤N≤2001≤Ai≤109 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            numList.add(sc.nextInt());
        }
        boolean flag = true;
        int counter = 0;
        while(flag) {
            for(int i = 0; i <numList.size(); i++) {
                if(numList.get(i) % 2 == 0) {
                    numList.set(i, numList.get(i) / 2);
                } else {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}