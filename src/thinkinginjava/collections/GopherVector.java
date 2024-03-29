package thinkinginjava.collections;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-13
 * Time: 10:43
 */
public class GopherVector {

    private Vector v = new Vector();

    public void addElement(Gopher m) {
        v.addElement(m);
    }

    public Gopher elementAt(int index) {
        return (Gopher) v.elementAt(index);
    }

    public int size() {
        return v.size();
    }

    public static void main(String[] args) {
        GopherVector gophers = new GopherVector();
        for (int i = 0; i < 3; i++)
            gophers.addElement(new Gopher(i));
        for (int i = 0; i < gophers.size(); i++)
            GopherTrap.caughtYa(gophers.elementAt(i));
    }

}
