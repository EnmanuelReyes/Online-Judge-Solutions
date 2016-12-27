package coj;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 20-Oct-16
 * Time: 1:28 PM
 *
 * http://coj.uci.cu/24h/problem.xhtml?pid=3137
 */
public class ValidateABC {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            final short T = sc.nextShort();
            for (int i = 0; i < T; i++) {
                final byte A = sc.nextByte();
                final byte B = sc.nextByte();
                final byte C = sc.nextByte();
                if (A + B == C) System.out.println("YES");
                else if (A - B == C) System.out.println("YES");
                else if (A * B == C) System.out.println("YES");
                else if (B != 0 && A % B == C) System.out.println("YES");
                else if (B != 0 && A / B == C) System.out.println("YES");
                else System.out.println("NO");
            }

        }
    }
}
