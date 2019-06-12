package thinkinginjava.inherit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 18:27
 */
class Villain {
    private int i;

    protected int read() {
        return i;
    }

    protected void set(int ii) {
        i = ii;
    }

    public Villain(int ii) {
        i = ii;
    }

    public int value(int m) {
        return m * i;
    }
}

public class Orc extends Villain {

    private int j;

    public Orc(int jj) {
        super(jj);
        j = jj;
    }

    public void change(int x) {
        set(x);
    }

}
