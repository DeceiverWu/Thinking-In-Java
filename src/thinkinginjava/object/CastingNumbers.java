package thinkinginjava.object;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 15:55
 */
public class CastingNumbers {

    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        System.out.println("above: " + above);
        System.out.println("below: " + below);
        System.out.println("(int)above: " + (int) above);
        System.out.println("(int)below: " + (int) below);
        System.out.println("(char)('a' + above): " + (char) ('a' + above));
        System.out.println("(char)('a' + below): " + (char) ('a' + below));
    }

}
