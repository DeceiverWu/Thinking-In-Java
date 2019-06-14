package thinkinginjava.collections;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-13
 * Time: 10:33
 */
public class Cat {

    private int catNumber;

    public Cat(int catNumber) {
        this.catNumber = catNumber;
    }

    void print() {
        System.out.println("Cat #" + catNumber);
    }
}
