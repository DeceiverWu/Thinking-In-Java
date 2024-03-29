package thinkinginjava.collections;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-13
 * Time: 10:38
 */
public class CatsAndDogs {

    public static void main(String[] args) {
        Vector cats = new Vector();
        for (int i = 0; i < 7; i++)
            cats.addElement(new Cat(i));
        // Not a problem to add a dog to cats:
        cats.addElement(new Dog(7));
        for (int i = 0; i < cats.size(); i++)
            ((Cat) cats.elementAt(i)).print();
        // Dog is detected only at run-time
    }

}
