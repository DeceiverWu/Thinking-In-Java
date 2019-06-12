package thinkinginjava.initialandclear;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 16:08
 */
public class OverloadingOrder {

    static void print(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void print(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        print("String first", 11);
        print(99, "Int first");
    }

}
