package thinkinginjava.collections;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-13
 * Time: 10:42
 */
public class Gopher {

    private int gopherNumber;

    Gopher(int i) {
        gopherNumber = i;
    }

    void print(String msg) {
        if (msg != null) System.out.println(msg);
        System.out.println(
                "Gopher number " + gopherNumber);
    }

}
