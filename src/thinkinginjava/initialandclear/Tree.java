package thinkinginjava.initialandclear;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 16:05
 */
public class Tree {

    int height;

    Tree() {
        prt("Planting a seedling");
        height = 0;
    }

    Tree(int i) {
        prt("Creating new Tree that is "
                + i + " feet tall");
        height = i;
    }

    void info() {
        prt("Tree is " + height
                + " feet tall");
    }

    void info(String s) {
        prt(s + ": Tree is "
                + height + " feet tall");
    }

    static void prt(String s) {
        System.out.println(s);
    }

    public static class Overloading {

        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                Tree t = new Tree(i);
                t.info();
                t.info("overloaded method");
            }
            // Overloaded constructor:
            new Tree();
        }

    }

}

