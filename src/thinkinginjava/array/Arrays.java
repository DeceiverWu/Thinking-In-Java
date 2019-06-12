package thinkinginjava.array;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 17:19
 */
public class Arrays {

    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5 };
        int[] a2;
        a2 = a1;
        for(int i = 0; i < a2.length; i++)
            a2[i]++;
        for(int i = 0; i < a1.length; i++)
            prt("a1[" + i + "] = " + a1[i]);
    }

    static void prt(String s) {
        System.out.println(s);
    }

}
