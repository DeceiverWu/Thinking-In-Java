package thinkinginjava.initialandclear;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 16:22
 */
public class OrderOfInitialization {

    public static void main(String[] args) {
        Card t = new Card();
        t.f(); // Shows that construction is done
    }

}
