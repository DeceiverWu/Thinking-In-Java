package thinkinginjava.collections;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-13
 * Time: 10:40
 */
public class MouseTrap {

    static void caughtYa(Object m) {
        Mouse mouse = (Mouse) m; // Cast from Object
        mouse.print("Caught one!");
    }
}
