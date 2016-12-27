package coj;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 21-Oct-16
 * Time: 3:34 PM
 * <p>
 * http://coj.uci.cu/24h/problem.xhtml?pid=3698
 */
public class UpperLowerCounting {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            final byte N = sc.nextByte();
            final String S = sc.next();
            byte lowers;
            byte uppers = 0;

            for (int i = 0; i < N; i++) {
                char c = S.charAt(i);
                if (Character.isUpperCase(c)) {
                    uppers++;
                }
            }
            lowers = (byte) (N - uppers);

            System.out.println(uppers + " " + lowers);
        }
    }
}
