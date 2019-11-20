package thinkinginjava.object;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 15:07
 */
public class Bool {

    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt() % 100;
        int j = rand.nextInt() % 100;
        prt("i = " + i);
        prt("j = " + j);
        prt("i > j is " + (i > j));
        prt("i < j is " + (i < j));
        prt("i >= j is " + (i >= j));
        prt("i <= j is " + (i <= j));
        prt("i == j is " + (i == j));
        prt("i != j is " + (i != j));

        prt("(i < 10) && (j < 10) is "
                + ((i < 10) && (j < 10)));
        prt("(i < 10) || (j < 10) is "
                + ((i < 10) || (j < 10)));
    }

    static void prt(String s) {
        System.out.println(s);
    }
}
