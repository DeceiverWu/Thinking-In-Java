package thinkinginjava.object;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 15:46
 */
public class LabeledWhile {

    public static void main(String[] args) {
        int i = 0;
        outer:
        while (true) {
            prt("Outer while loop");
            while (true) {
                i++;
                prt("i = " + i);
                if (i == 1) {
                    prt("continue");
                    continue;
                }
                if (i == 3) {
                    prt("continue outer");
                }
                continue outer;
            }
        }
    }

    static void prt(String s) {
        System.out.println(s);
    }
}

