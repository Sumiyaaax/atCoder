import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
/*     問題文X 段重ねの鏡餅 (X≥1) とは、X 枚の円形の餅を縦に積み重ねたものであって、どの餅もその真下の餅より直径が小さい（一番下の餅を除く）もののことです
    例えば、直径 10、8、6 センチメートルの餅をこの順に下から積み重ねると 3 段重ねの鏡餅になり、餅を一枚だけ置くと 1 段重ねの鏡餅になります
    ダックスフンドのルンルンは N 枚の円形の餅を持っていて、そのうち i 枚目の餅の直径は di センチメートルです
    これらの餅のうち一部または全部を使って鏡餅を作るとき、最大で何段重ねの鏡餅を作ることができるでしょうか
    制約1≤N≤100 1≤di≤100入力値はすべて整数である
 */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Set<Integer> kagamiMochiSet = new HashSet<>();
        for(int i = 0; i < num; i++) {
            kagamiMochiSet.add(sc.nextInt());
        }
        System.out.println(kagamiMochiSet.size());
        sc.close();
    }
}