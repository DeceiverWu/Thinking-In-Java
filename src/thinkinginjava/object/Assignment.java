package thinkinginjava.object;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 14:49
 */
public class Assignment {

    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;
        System.out.println("1: n1.i: " + n1.i + ", n2.i: " + n2.i);
        n1 = n2;
        System.out.println("2: n1.i: " + n1.i + ", n2.i: " + n2.i);
        n1.i = 27;
        System.out.println("3: n1.i: " + n1.i + ", n2.i: " + n2.i);
    }
}
