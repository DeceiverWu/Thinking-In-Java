package thinkinginjava.interfaces;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-13
 * Time: 09:58
 */
public class Sequence {

    private Object[] o;
    private int next = 0;

    public Sequence(int size) {
        o = new Object[size];
    }

    public void add(Object obj) {
        if (next < o.length) {
            o[next] = obj;
            next++;
        }
    }

    private class SSelector implements Selector {

        int i = 0;

        @Override
        public boolean end() {
            return i == o.length;
        }

        @Override
        public Object current() {
            return o[i];
        }

        @Override
        public void next() {
            if (i < o.length) {
                i++;
            }
        }
    }

    public Selector getSelector() {
        return new SSelector();
    }

    public static void main(String[] args) {
        Sequence s = new Sequence(10);
        for (int i = 0; i < 10; i++)
            s.add(Integer.toString(i));
        Selector sl = s.getSelector();
        while (!sl.end()) {
            System.out.println((String) sl.current());
            sl.next();
        }

    }
}
