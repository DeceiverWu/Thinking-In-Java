package thinkinginjava.object;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 15:56
 */
public class RandomBounds {

    static void usage() {
        System.err.println("Usage: \n\t" + "RandomBounds lower\n\t" + "RandomBounds upper");
        System.exit(1);
    }

    public static void main(String[] args) {
        if (args.length != 1) usage();
        if (args[0].equals("lower")) {
            while (Math.random() != 0.0) ; // Keep trying
            System.out.println("Produced 0.0!");
        } else if (args[0].equals("upper")) {
            while (Math.random() != 1.0) ; // Keep trying
            System.out.println("Produced 1.0!");
        } else {
            usage();
        }
    }

}
