package thinkinginjava.object;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 15:42
 */
public class ListCharacters {

    public static void main(String[] args) {
        for( char c = 0; c < 128; c++)
            if (c != 26 )  // ANSI Clear screen
                System.out.println("value: " + (int)c + " character: " + c);
    }

}
