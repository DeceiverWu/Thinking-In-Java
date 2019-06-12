package thinkinginjava.initialandclear;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 16:00
 */
public class SimpleConstructor {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            new Rock();

        for(int i = 0; i < 10; i++)
            new Rock(i);
    }

}
