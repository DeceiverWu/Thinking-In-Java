package thinkinginjava.collections;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-13
 * Time: 10:41
 */
public class WorksAnyway {

    public static void main(String[] args) {
        Vector mice = new Vector();
        for (int i = 0; i < 3; i++)
            mice.addElement(new Mouse(i));
        for (int i = 0; i < mice.size(); i++) {
            // No cast necessary, automatic call
            // to Object.toString():
            System.out.println("Free mouse: " + mice.elementAt(i));
            MouseTrap.caughtYa(mice.elementAt(i));
        }
    }

}
