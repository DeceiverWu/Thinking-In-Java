package thinkinginjava.array;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 17:20
 */
public class ArrayNew {

    static Random rand = new Random();

    static int pRand(int mod) {
        return Math.abs(rand.nextInt()) % mod + 1;
    }

    public static void main(String[] args) {
        int[] a;
        a = new int[pRand(20)];
        prt("length of a = " + a.length);
        for (int i = 0; i < a.length; i++)
            prt("a[" + i + "] = " + a[i]);
    }

    static void prt(String s) {
        System.out.println(s);
    }

}
