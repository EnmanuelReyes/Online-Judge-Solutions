package coj;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 17-Oct-16
 * Time: 9:05 AM
 *
 * http://coj.uci.cu/24h/problem.xhtml?pid=3683
 */
public class WhosLeftWhosRight {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            final int N = sc.nextInt();
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            treeMap.put(0,0);
            treeMap.put(1000000,1000000);
            for (int i = 0; i < N; i++) {
                int Ai = sc.nextInt();
                int y = treeMap.ceilingKey(Ai);
                int x = treeMap.floorKey(Ai);
                treeMap.put(Ai, Ai);
                System.out.println(x + " " + y);
            }

        }
    }
}
