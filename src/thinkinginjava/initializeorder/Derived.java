package thinkinginjava.initializeorder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-12
 * Time: 16:58
 */

/**
 * 打印
 */
class Log {

    public static String baseFieldInit() {
        System.out.println("Base Normal Field");
        return "";
    }

    public static String baseStaticFieldInit() {
        System.out.println("Base Static Field");
        return "";
    }

    public static String fieldInit() {
        System.out.println("Normal Field");
        return "";
    }

    public static String staticFieldInit() {
        System.out.println("Static Field");
        return "";
    }
}

/**
 * 基类
 */
class Base {

    /*1*/
    static {
        System.out.println("Base Static Block 1");
    }

    /*1*/
    private static String staticValue = Log.baseStaticFieldInit();

    /*1*/
    static {
        System.out.println("Base Static Block 2");
    }

    /*3*/
    {
        System.out.println("Base Normal Block 1");
    }

    /*3*/
    private static String value = Log.baseFieldInit();

    /*3*/
    {
        System.out.println("Base Normal Block 2");
    }

    /*4*/
    Base() {
        System.out.println("Base Constructor");
    }

}

public class Derived extends Base {

    /*2*/
    static {
        System.out.println("Static Block 1");
    }

    /*2*/
    private static String staticValue = Log.staticFieldInit();

    /*2*/
    static {
        System.out.println("Static Block 2");
    }

    /*5*/
    {
        System.out.println("Normal Block 1");
    }

    /*5*/
    private String value = Log.fieldInit();

    /*5*/
    {
        System.out.println("Normal Block 2");
    }

    Derived() {
        System.out.println("Derived Constructor");
    }

    public static void main(String[] args) {
        Derived derived = new Derived();
    }

    /**
     * 结果：
     *
     * 对象在class文件加载完毕，以及为各成员在方法区开辟好内存空间之后，就开始所谓“初始化”的步骤：
     *
     * 1. 基类静态代码块，基类静态成员字段 （并列优先级，按代码中出现先后顺序执行）（只有第一次加载类时执行）
     * 2. 派生类静态代码块，派生类静态成员字段 （并列优先级，按代码中出现先后顺序执行）（只有第一次加载类时执行）
     * 3. 基类普通代码块，基类普通成员字段 （并列优先级，按代码中出现先后顺序执行）
     * 4. 基类构造函数
     * 5. 派生类普通代码块，派生类普通成员字段 （并列优先级，按代码中出现先后顺序执行）
     * 6. 派生类构造函数
     *
     * 注意，第1，2步的静态过程，只在这个类第一次被加载的时候才运行。如果创建两个对象，
     * 第二次创建d2就只执行3，4，5，6步。
     */
}
