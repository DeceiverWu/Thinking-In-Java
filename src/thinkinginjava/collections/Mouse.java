package thinkinginjava.collections;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-13
 * Time: 10:39
 */
public class Mouse {

    private int mouseNumber;

    Mouse(int i) {
        mouseNumber = i;
    }

    // Magic method:
    public String toString() {
        return "This is Mouse #" + mouseNumber;
    }

    void print(String msg) {
        if (msg != null) System.out.println(msg);
        System.out.println(
                "Mouse number " + mouseNumber);
    }

}
