package thinkinginjava.io;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-13
 * Time: 11:14
 */
public class IOStreamDemo {

    public static void main(String[] args) {
        try {
            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(args[0])));
            String s, s2 = new String();
            while ((s = in.readLine()) != null) {
                s2 += s + "\n";
            }
            in.close();

            StringBufferInputStream in2 = new StringBufferInputStream(s2);
            int c;
            while ((c = in2.read()) != -1) {
                System.out.println((char) c);
            }

            try {
                DataInputStream in3 = new DataInputStream(new StringBufferInputStream(s2));
                while (true)
                    System.out.print((char) in3.readByte());
            } catch (EOFException e) {
                System.out.println("End of stream encountered");
            }

            try {
                LineNumberInputStream li = new LineNumberInputStream(new StringBufferInputStream(s2));
                DataInputStream in4 = new DataInputStream(li);
                PrintStream out1 = new PrintStream(new BufferedOutputStream(new FileOutputStream("IODemo.out")));
                while ((s = in4.readLine()) != null)
                    out1.println("Line " + li.getLineNumber() + s);
                out1.close(); // finalize() not reliable!
            } catch (EOFException e) {
                System.out.println("End of stream encountered");
            }


        } catch (Exception e) {

        }
    }
}
